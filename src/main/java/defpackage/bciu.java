package defpackage;

import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketImpl;

/* renamed from: bciu */
final class bciu extends SocketImpl {
    bciu(FileDescriptor fileDescriptor) {
        this.fd = fileDescriptor;
    }

    /* Access modifiers changed, original: protected|final */
    public final void close() {
    }

    /* Access modifiers changed, original: protected|final */
    public final void create(boolean z) {
    }

    /* Access modifiers changed, original: protected|final */
    public final void accept(SocketImpl socketImpl) {
        throw new RuntimeException("accept not implemented");
    }

    /* Access modifiers changed, original: protected|final */
    public final int available() {
        throw new RuntimeException("accept not implemented");
    }

    /* Access modifiers changed, original: protected|final */
    public final void bind(InetAddress inetAddress, int i) {
        throw new RuntimeException("accept not implemented");
    }

    /* Access modifiers changed, original: protected|final */
    public final void connect(InetAddress inetAddress, int i) {
        throw new RuntimeException("connect not implemented");
    }

    /* Access modifiers changed, original: protected|final */
    public final void connect(SocketAddress socketAddress, int i) {
        throw new RuntimeException("connect not implemented");
    }

    /* Access modifiers changed, original: protected|final */
    public final void connect(String str, int i) {
        throw new RuntimeException("connect not implemented");
    }

    /* Access modifiers changed, original: protected|final */
    public final InputStream getInputStream() {
        throw new RuntimeException("getInputStream not implemented");
    }

    /* Access modifiers changed, original: protected|final */
    public final OutputStream getOutputStream() {
        throw new RuntimeException("getOutputStream not implemented");
    }

    /* Access modifiers changed, original: protected|final */
    public final void listen(int i) {
        throw new RuntimeException("listen not implemented");
    }

    /* Access modifiers changed, original: protected|final */
    public final void sendUrgentData(int i) {
        throw new RuntimeException("sendUrgentData not implemented");
    }

    public final Object getOption(int i) {
        throw new RuntimeException("getOption not implemented");
    }

    public final void setOption(int i, Object obj) {
        throw new RuntimeException("setOption not implemented");
    }
}
