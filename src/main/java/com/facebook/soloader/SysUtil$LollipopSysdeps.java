package com.facebook.soloader;

import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.FileDescriptor;
import java.io.IOException;

final class SysUtil$LollipopSysdeps {
    private SysUtil$LollipopSysdeps() {
    }

    public static String[] getSupportedAbis() {
        return Build.SUPPORTED_32_BIT_ABIS;
    }

    public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) {
        try {
            Os.posix_fallocate(fileDescriptor, 0, j);
        } catch (ErrnoException e) {
            if (e.errno != OsConstants.EOPNOTSUPP && e.errno != OsConstants.ENOSYS && e.errno != OsConstants.EINVAL) {
                throw new IOException(e.toString(), e);
            }
        }
    }
}
