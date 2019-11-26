package defpackage;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: batd */
public final class batd {
    public final List a;
    public final barq b;
    private final int c = this.a.hashCode();

    public batd(SocketAddress socketAddress) {
        Object obj = barq.b;
        List singletonList = Collections.singletonList(socketAddress);
        amqw.a(singletonList.isEmpty() ^ 1, (Object) "addrs is empty");
        this.a = Collections.unmodifiableList(new ArrayList(singletonList));
        this.b = (barq) amqw.a(obj, (Object) "attrs");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 3) + valueOf2.length());
        stringBuilder.append("[");
        stringBuilder.append(valueOf);
        stringBuilder.append("/");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final int hashCode() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof batd) {
            batd batd = (batd) obj;
            if (this.a.size() == batd.a.size()) {
                for (int i = 0; i < this.a.size(); i++) {
                    if (!((SocketAddress) this.a.get(i)).equals(batd.a.get(i))) {
                        return false;
                    }
                }
                if (this.b.equals(batd.b)) {
                    return true;
                }
            }
        }
        return false;
    }
}
