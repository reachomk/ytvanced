package defpackage;

import android.app.PendingIntent;

/* renamed from: aist */
final class aist extends aiti {
    private Boolean a;
    private Integer b;
    private Integer c;
    private PendingIntent d;
    private Boolean e;

    aist() {
    }

    public final aiti a(boolean z) {
        this.a = Boolean.valueOf(z);
        return this;
    }

    public final aiti a(int i) {
        this.b = Integer.valueOf(i);
        return this;
    }

    public final aiti b(int i) {
        this.c = Integer.valueOf(i);
        return this;
    }

    public final aiti a(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            this.d = pendingIntent;
            return this;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    public final aiti a() {
        this.e = Boolean.valueOf(false);
        return this;
    }

    public final aitj b() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" shouldShow");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" actionIcon");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" actionTitle");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" pendingIntent");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" showInCompactMode");
        }
        if (str.isEmpty()) {
            return new aisq(this.a.booleanValue(), this.b.intValue(), this.c.intValue(), this.d, this.e.booleanValue());
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }
}
