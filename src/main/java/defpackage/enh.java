package defpackage;

import java.util.UUID;

/* renamed from: enh */
final class enh implements enk {
    private final Object a;
    private boolean b;
    private apxu c;
    private aiqq d;
    private String e;
    private Long f;

    enh(UUID uuid, aiqq aiqq) {
        this(uuid, elq.a(aiqq));
        this.d = aiqq;
    }

    enh(UUID uuid, apxu apxu) {
        this.a = amqw.a((Object) uuid);
        a((apxu) amqw.a((Object) apxu));
    }

    public final synchronized void a(apxu apxu) {
        amqw.a((Object) apxu);
        if (!amqq.a(this.c, apxu)) {
            String a = elq.a(apxu);
            amqw.b(enj.a(this, apxu));
            this.c = apxu;
            this.e = a;
            this.d = null;
        }
    }

    public final synchronized void a() {
        this.e = null;
    }

    public final UUID b() {
        amqw.b(this.a instanceof UUID);
        return (UUID) UUID.class.cast(this.a);
    }

    public final String c() {
        return e().b();
    }

    public final synchronized apxu d() {
        return this.c;
    }

    public final synchronized aiqq e() {
        if (this.d == null) {
            apxu apxu = this.c;
            Long l = this.f;
            aiqs a = aiqq.a();
            a.a = apxu;
            aiqq b = a.b();
            if (l != null) {
                b.a(l.longValue());
            }
            this.d = b;
        }
        return this.d;
    }

    public final synchronized void a(long j) {
        j = Math.max(0, j);
        Long l = this.f;
        if (l == null || l.longValue() != j) {
            this.f = Long.valueOf(j);
            this.d = null;
        }
    }

    public final synchronized String f() {
        return this.e;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enh)) {
            return false;
        }
        return this.a.equals(((enh) enh.class.cast(obj)).a);
    }

    public final void a(boolean z) {
        this.b = z;
    }

    public final boolean g() {
        return this.b;
    }
}
