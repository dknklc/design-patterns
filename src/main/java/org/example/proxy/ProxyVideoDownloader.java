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
One of the most common examples of the Proxy pattern in Spring is the use of dynamic proxies to provide declarative transaction management for methods in a service layer.
Here is an example of how we can use Spring’s transaction management using dynamic proxies:

@Transactional
public void updateEmployee(Employee employee) {
    employeeDao.update(employee);
}
In the above example, the @Transactional annotation tells Spring to apply transaction management to the updateEmployee() method.
When this method is invoked, Spring creates a dynamic proxy object that intercepts the method call and performs the necessary transaction management operations,
 such as beginning a transaction, committing the transaction, or rolling back the transaction if an exception occurs.

 */

/*
 - If the video is already downloaded, return it from the videoCache
 - Else download it by using the RealVideoDownloader service.
 - By doing so, we are getting rid of the installation of the same video again and again. If it is already downloaded, we are not going to apply the RealVideoDownloader service, so get rid of heavy video download process.
 */