package defpackage;

/* renamed from: apsk */
public final class apsk implements aadq {
    public static final aaeb a = new apsm();
    public final aprw b;
    private final aadw c;

    public static apsn a(String str) {
        return (apsn) a.a(str);
    }

    public final aaeb getType() {
        return a;
    }

    public final byte[] c() {
        return this.b.toByteArray();
    }

    public final String a() {
        return this.b.d;
    }

    public final Long getCreated() {
        return Long.valueOf(this.b.e);
    }

    public final apsc getChatMessageMetadataType() {
        aprw aprw = this.b;
        if (aprw.b == 4) {
            return (apsc) aprw.c;
        }
        return apsc.c;
    }

    public final apsg getChatMessageTextType() {
        aprw aprw = this.b;
        if (aprw.b == 5) {
            return (apsg) aprw.c;
        }
        return apsg.i;
    }

    public final apsi getChatMessageVideoType() {
        aprw aprw = this.b;
        if (aprw.b == 6) {
            return (apsi) aprw.c;
        }
        return apsi.m;
    }

    public final apsa getChatMessageLinkType() {
        aprw aprw = this.b;
        if (aprw.b == 7) {
            return (apsa) aprw.c;
        }
        return apsa.f;
    }

    public final aprs getChatMessageChannelType() {
        aprw aprw = this.b;
        if (aprw.b == 8) {
            return (aprs) aprw.c;
        }
        return aprs.i;
    }

    public final apse getChatMessagePlaylistType() {
        aprw aprw = this.b;
        if (aprw.b == 9) {
            return (apse) aprw.c;
        }
        return apse.i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof apsk) {
            apsk apsk = (apsk) obj;
            if (this.c == apsk.c && this.b.equals(apsk.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 24);
        stringBuilder.append("ChatMessageEntityModel{");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final apsn b() {
        return new apsn((aprz) ((anxo) this.b.toBuilder()));
    }

    /* synthetic */ apsk(aprw aprw, aadw aadw) {
        this.b = aprw;
        this.c = aadw;
    }

    public final amuw d() {
        return amwp.a;
    }
}
