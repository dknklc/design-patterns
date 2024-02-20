package org.example.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoDownloader implements VideoDownloader{
    private final VideoDownloader downloader = new RealVideoDownloader();
    private final Map<String, Video> videoCache = new HashMap<>();

    @Override
    public Video getVideo(String videoName) {
        if(videoCache.containsKey(videoName)){
            return videoCache.get(videoName);
        }
        Video video = downloader.getVideo(videoName);
        videoCache.put(videoName, video);
        return video;
    }
}

/*
This pattern is particularly used heavily in Spring AOP. As an example, In Spring AOP you create proxies of the objects that handle the cross cutting concern code.
The Proxy pattern also forms the core foundation of remoting technologies that Spring supports, such as RMI, Spring’s HTTP Invoker, Hessian, and Burlap.
 */

/*
 - If the video is already downloaded, return it from the videoCache
 - Else download it by using the RealVideoDownloader service.
 - By doing so, we are getting rid of the installation of the same video again and again. If it is already downloaded, we are not going to apply the RealVideoDownloader service, so get rid of heavy video download process.
 */