package defpackage;

import android.os.Bundle;

/* renamed from: bao */
public final class bao {
    public final Bundle a;
    private baz b;

    public bao(baz baz, boolean z) {
        if (baz != null) {
            this.a = new Bundle();
            this.b = baz;
            this.a.putBundle("selector", baz.a);
            this.a.putBoolean("activeScan", z);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final baz a() {
        c();
        return this.b;
    }

    private final void c() {
        if (this.b == null) {
            this.b = baz.a(this.a.getBundle("selector"));
            if (this.b == null) {
                this.b = baz.c;
            }
        }
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bao) {
            bao bao = (bao) obj;
            if (a().equals(bao.a()) && b() == bao.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DiscoveryRequest{ selector=");
        stringBuilder.append(a());
        stringBuilder.append(", activeScan=");
        stringBuilder.append(b());
        stringBuilder.append(", isValid=");
        c();
        baz baz = this.b;
        baz.b();
        stringBuilder.append(baz.b.contains(null) ^ 1);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
