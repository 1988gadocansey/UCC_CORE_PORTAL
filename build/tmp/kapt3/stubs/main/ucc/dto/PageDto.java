package ucc.dto;

import java.lang.System;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Data
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lucc/dto/PageDto;", "T", "", "()V", "content", "", "getContent", "()Ljava/util/List;", "setContent", "(Ljava/util/List;)V", "numberOfElements", "", "getNumberOfElements", "()I", "setNumberOfElements", "(I)V", "pageNumber", "getPageNumber", "setPageNumber", "size", "getSize", "setSize", "totalPages", "getTotalPages", "setTotalPages", "totalSize", "getTotalSize", "setTotalSize", "ucc"})
public final class PageDto<T extends java.lang.Object> {
    private int pageNumber = 0;
    private int size = 0;
    private int numberOfElements = 0;
    private int totalPages = 0;
    private int totalSize = 0;
    @org.jetbrains.annotations.NotNull
    private java.util.List<? extends T> content;
    
    public PageDto() {
        super();
    }
    
    public final int getPageNumber() {
        return 0;
    }
    
    public final void setPageNumber(int p0) {
    }
    
    public final int getSize() {
        return 0;
    }
    
    public final void setSize(int p0) {
    }
    
    public final int getNumberOfElements() {
        return 0;
    }
    
    public final void setNumberOfElements(int p0) {
    }
    
    public final int getTotalPages() {
        return 0;
    }
    
    public final void setTotalPages(int p0) {
    }
    
    public final int getTotalSize() {
        return 0;
    }
    
    public final void setTotalSize(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<T> getContent() {
        return null;
    }
    
    public final void setContent(@org.jetbrains.annotations.NotNull
    java.util.List<? extends T> p0) {
    }
}