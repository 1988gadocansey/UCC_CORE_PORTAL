package ucc.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lucc/services/PhotoService;", "", "sftp", "Lucc/configs/SftpConfiguration;", "(Lucc/configs/SftpConfiguration;)V", "hello", "", "ucc"})
@jakarta.inject.Singleton
public final class PhotoService {
    private final ucc.configs.SftpConfiguration sftp = null;
    
    @jakarta.inject.Inject
    public PhotoService(@org.jetbrains.annotations.NotNull
    @jakarta.inject.Named(value = "sftp")
    ucc.configs.SftpConfiguration sftp) {
        super();
    }
    
    public final void hello() {
    }
}