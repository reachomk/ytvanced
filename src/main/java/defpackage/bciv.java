package defpackage;

import java.io.FileDescriptor;
import java.net.Socket;

/* renamed from: bciv */
public final class bciv extends Socket {
    public bciv(FileDescriptor fileDescriptor) {
        super(new bciu(fileDescriptor));
    }
}
