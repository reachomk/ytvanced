package defpackage;

/* renamed from: aiqp */
final class aiqp extends aire {
    private Integer a;
    private int b;

    aiqp() {
    }

    public final aire a(int i) {
        this.a = Integer.valueOf(i);
        return this;
    }

    public final airf a() {
        String str = "";
        if (this.b == 0) {
            str = str.concat(" prefetchReason");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" playbackBeginsInSeconds");
        }
        if (str.isEmpty()) {
            return new aiqm(this.b, this.a.intValue());
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    public final aire b(int i) {
        if (i != 0) {
            this.b = i;
            return this;
        }
        throw new NullPointerException("Null prefetchReason");
    }
}
