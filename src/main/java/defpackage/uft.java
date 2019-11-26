package defpackage;

import android.system.Os;
import java.io.FileDescriptor;
import java.util.concurrent.Callable;

/* renamed from: uft */
final /* synthetic */ class uft implements Callable {
    private final FileDescriptor a;

    uft(FileDescriptor fileDescriptor) {
        this.a = fileDescriptor;
    }

    public final Object call() {
        return Os.fstat(this.a);
    }
}
