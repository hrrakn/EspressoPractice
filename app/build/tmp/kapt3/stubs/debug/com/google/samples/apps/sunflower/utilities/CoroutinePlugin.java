package com.google.samples.apps.sunflower.utilities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0007R@\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR@\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\nR\u0011\u0010\u0016\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u000eR@\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\n\u00a8\u0006\u001d"}, d2 = {"Lcom/google/samples/apps/sunflower/utilities/CoroutinePlugin;", "", "()V", "<set-?>", "Lkotlin/Function1;", "Lkotlin/coroutines/CoroutineContext;", "computationDispatcherHandler", "getComputationDispatcherHandler", "()Lkotlin/jvm/functions/Function1;", "setComputationDispatcherHandler", "(Lkotlin/jvm/functions/Function1;)V", "defaultComputationDispatcher", "defaultDispatcher", "getDefaultDispatcher", "()Lkotlin/coroutines/CoroutineContext;", "defaultIoDispatcher", "defaultMainDispatcher", "ioDispatcher", "getIoDispatcher", "ioDispatcherHandler", "getIoDispatcherHandler", "setIoDispatcherHandler", "mainDispatcher", "getMainDispatcher", "mainDispatcherHandler", "getMainDispatcherHandler", "setMainDispatcherHandler", "reset", "", "app_debug"})
public final class CoroutinePlugin {
    private static final kotlin.coroutines.CoroutineContext defaultIoDispatcher = null;
    @org.jetbrains.annotations.Nullable()
    private static kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext, ? extends kotlin.coroutines.CoroutineContext> ioDispatcherHandler;
    private static final kotlin.coroutines.CoroutineContext defaultComputationDispatcher = null;
    @org.jetbrains.annotations.Nullable()
    private static kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext, ? extends kotlin.coroutines.CoroutineContext> computationDispatcherHandler;
    private static final kotlin.coroutines.CoroutineContext defaultMainDispatcher = null;
    @org.jetbrains.annotations.Nullable()
    private static kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext, ? extends kotlin.coroutines.CoroutineContext> mainDispatcherHandler;
    public static final com.google.samples.apps.sunflower.utilities.CoroutinePlugin INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.coroutines.CoroutineContext getIoDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext, kotlin.coroutines.CoroutineContext> getIoDispatcherHandler() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void setIoDispatcherHandler(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext, ? extends kotlin.coroutines.CoroutineContext> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.coroutines.CoroutineContext getDefaultDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext, kotlin.coroutines.CoroutineContext> getComputationDispatcherHandler() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void setComputationDispatcherHandler(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext, ? extends kotlin.coroutines.CoroutineContext> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.coroutines.CoroutineContext getMainDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext, kotlin.coroutines.CoroutineContext> getMainDispatcherHandler() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void setMainDispatcherHandler(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext, ? extends kotlin.coroutines.CoroutineContext> p0) {
    }
    
    @androidx.annotation.VisibleForTesting()
    public static final void reset() {
    }
    
    private CoroutinePlugin() {
        super();
    }
}