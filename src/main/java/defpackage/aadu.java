package defpackage;

import java.io.IOException;

/* renamed from: aadu */
public final class aadu {
    public static final aadu a = aadu.a().a();
    public final arfv b;

    private static aadx a() {
        return new aadx();
    }

    public static aadu a(String str, anze anze) {
        aadx a = aadu.a();
        a.a(str, anze);
        return a.a();
    }

    public final anze a(String str, anzq anzq) {
        Object a;
        alvd a2 = alux.a(anzq);
        if (this.b.a(str)) {
            try {
                arfv arfv = this.b;
                anvu anvu = anvu.a;
                anyy anyy = arfv.a;
                if (anyy.containsKey(str)) {
                    anvu = (anvu) anyy.get(str);
                }
                a = a2.a(anvu.d());
            } catch (IOException e) {
                throw new IllegalStateException(String.format("You might have accessed value with wrong marshaller for key %s", new Object[]{str}), e);
            }
        }
        a = null;
        return (anze) a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aadu)) {
            return false;
        }
        return amqq.a(this.b, ((aadu) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    /* synthetic */ aadu(arfv arfv) {
        this.b = (arfv) amqw.a((Object) arfv);
    }
}
