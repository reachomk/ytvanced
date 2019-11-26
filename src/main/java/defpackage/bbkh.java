package defpackage;

/* renamed from: bbkh */
public final class bbkh extends bbkp {
    public bbks a;
    public Long b;
    private Long c;
    private Long d;

    public final bbkp a(long j) {
        this.c = Long.valueOf(j);
        return this;
    }

    public final bbkp b(long j) {
        this.d = Long.valueOf(j);
        return this;
    }

    public final bbkq a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" type");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" messageId");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" uncompressedMessageSize");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" compressedMessageSize");
        }
        if (str.isEmpty()) {
            return new bbki(this.a, this.b.longValue(), this.c.longValue(), this.d.longValue());
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }
}
