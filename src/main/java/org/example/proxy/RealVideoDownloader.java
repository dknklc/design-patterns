package org.example.proxy;

public class RealVideoDownloader implements VideoDownloader{
    @Override
    public Video getVideo(String videoName) {
        System.out.println("Connecting to https://www.youtube.com");
        System.out.println("Downloading the video");
        System.out.println("Retrieving video metadata");
        return new Video(videoName);
    }
}
