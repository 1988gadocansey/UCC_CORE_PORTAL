package ucc;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lucc/DataInitializer;", "", "posts", "Lucc/repositories/PostRepository;", "(Lucc/repositories/PostRepository;)V", "onStartUp", "", "e", "Lio/micronaut/runtime/server/event/ServerStartupEvent;", "DataInitializer", "ucc"})
@io.micronaut.context.annotation.Requires(notEnv = {"mock"})
@jakarta.inject.Singleton
public final class DataInitializer {
    private final ucc.repositories.PostRepository posts = null;
    private static final org.slf4j.Logger log = null;
    
    public DataInitializer(@org.jetbrains.annotations.NotNull
    ucc.repositories.PostRepository posts) {
        super();
    }
    
    @io.micronaut.runtime.event.annotation.EventListener
    public final void onStartUp(@org.jetbrains.annotations.NotNull
    io.micronaut.runtime.server.event.ServerStartupEvent e) {
    }
}