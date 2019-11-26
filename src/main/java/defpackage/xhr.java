package defpackage;

import java.net.NetworkInterface;
import java.util.Enumeration;

/* renamed from: xhr */
public final class xhr {
    public final NetworkInterface a;

    public xhr(NetworkInterface networkInterface) {
        this.a = networkInterface;
    }

    public final String a() {
        return this.a.getName();
    }

    public final Enumeration b() {
        return this.a.getInetAddresses();
    }

    public final String c() {
        return this.a.getDisplayName();
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
