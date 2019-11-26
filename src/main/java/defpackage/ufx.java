package defpackage;

import java.io.FileDescriptor;
import java.util.concurrent.Callable;

/* renamed from: ufx */
final /* synthetic */ class ufx implements Callable {
    private final FileDescriptor a;

    ufx(FileDescriptor fileDescriptor) {
        this.a = fileDescriptor;
    }

    public final Object call() {
        FileDescriptor fileDescriptor = this.a;
        return ufv.a(ufv.b.invoke(ufv.c, new Object[]{fileDescriptor}));
    }
}
