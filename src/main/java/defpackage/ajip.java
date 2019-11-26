package defpackage;

/* renamed from: ajip */
public final class ajip {
    public int a = -1;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e = 1;
    public int f = 100;
    public int g;
    public int h;
    public String i = "#FFFFFF";
    public int j = 255;
    public String k;
    public int l;
    public String m;

    public ajip() {
        String str = "#000000";
        this.k = str;
        this.l = 255;
        this.m = str;
    }

    public ajip(ajip ajip) {
        String str = "#000000";
        this.k = str;
        this.l = 255;
        this.m = str;
        this.a = ajip.a;
        this.b = ajip.b;
        this.c = ajip.c;
        this.d = ajip.d;
        this.e = ajip.e;
        this.f = ajip.f;
        this.g = ajip.g;
        this.h = ajip.h;
        this.i = ajip.i;
        this.j = ajip.j;
        this.k = ajip.k;
        this.l = ajip.l;
        this.m = ajip.m;
    }

    public final String a() {
        StringBuilder stringBuilder = new StringBuilder(128);
        if (!this.i.equals("#FFFFFF")) {
            stringBuilder.append("<font color=");
            stringBuilder.append(this.i);
            stringBuilder.append(">");
        }
        if (this.b) {
            stringBuilder.append("<I>");
        }
        return stringBuilder.toString();
    }

    public final String b() {
        StringBuilder stringBuilder = new StringBuilder(128);
        if (this.b) {
            stringBuilder.append("</I>");
        }
        if (!this.i.equals("#FFFFFF")) {
            stringBuilder.append("</font>");
        }
        return stringBuilder.toString();
    }
}
