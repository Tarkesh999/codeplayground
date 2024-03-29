package com.lld.designpatterns.behavioral.observer.listeners;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}