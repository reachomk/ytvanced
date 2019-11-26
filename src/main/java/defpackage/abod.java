package defpackage;

import android.text.TextUtils;
import java.net.URLEncoder;

/* renamed from: abod */
public final class abod {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public long i;
    public String j;
    public String k;
    public long l = -1;
    public int m = -1;
    public boolean n;
    public bqj o;
    public bqk p;
    private boolean q;
    private String r;
    private String s;

    public final abod a() {
        this.q = true;
        return this;
    }

    public final abod a(String str, String str2) {
        this.r = str;
        this.s = str2;
        return this;
    }

    public final boolean b() {
        return TextUtils.isEmpty(this.e) ^ 1;
    }

    public final abop c() {
        int isEmpty = TextUtils.isEmpty(this.r) ^ 1;
        if (TextUtils.isEmpty(this.e) && (TextUtils.isEmpty(this.a) || TextUtils.isEmpty(this.b) || this.d == null)) {
            throw new IllegalStateException();
        }
        String str = "";
        if (!this.q || this.d.equals(str)) {
            String valueOf;
            String str2 = "https://suggestqueries.google.com";
            String str3 = this.e;
            if (str3 != null) {
                valueOf = String.valueOf(str3);
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
            } else {
                str2.length();
                str2 = "https://suggestqueries.google.com/complete/search?ds=yt&hjson=t&oe=UTF-8&xssi=t";
                str3 = String.valueOf(String.format("&client=%s", new Object[]{this.a}));
                str2 = String.valueOf(str3.length() == 0 ? new String(str2) : str2.concat(str3));
                str3 = String.valueOf(String.format("&hl=%s", new Object[]{this.b}));
                Object str4 = str3.length() == 0 ? new String(str2) : str2.concat(str3);
                if (this.c != null) {
                    str2 = String.valueOf(str4);
                    str3 = String.valueOf(String.format("&gl=%s", new Object[]{this.c}));
                    str4 = str3.length() == 0 ? new String(str2) : str2.concat(str3);
                }
                if (!TextUtils.isEmpty(this.g)) {
                    str2 = String.valueOf(str4);
                    str3 = String.valueOf(String.format("&sugexp=%s", new Object[]{this.g}));
                    str4 = str3.length() == 0 ? new String(str2) : str2.concat(str3);
                }
                if (this.q) {
                    this.d = str;
                    str2 = String.valueOf(str4);
                    str = "&gs_pcr=t";
                    str4 = str.length() == 0 ? new String(str2) : str2.concat(str);
                }
                if (!TextUtils.isEmpty(this.h)) {
                    str2 = String.format("&pq=%s", new Object[]{this.h});
                    str = String.format("&pq_sec=%s", new Object[]{Long.valueOf(this.i)});
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(str4).length() + String.valueOf(str2).length()) + String.valueOf(str).length());
                    stringBuilder.append(str4);
                    stringBuilder.append(str2);
                    stringBuilder.append(str);
                    str4 = stringBuilder.toString();
                }
                if (!TextUtils.isEmpty(this.j)) {
                    str2 = String.valueOf(str4);
                    str = String.valueOf(String.format("&video_id=%s", new Object[]{this.j}));
                    str4 = str.length() == 0 ? new String(str2) : str2.concat(str);
                }
                if (!TextUtils.isEmpty(this.k)) {
                    str2 = String.valueOf(str4);
                    str = String.valueOf(String.format("&pvideo_id=%s", new Object[]{this.k}));
                    str4 = str.length() == 0 ? new String(str2) : str2.concat(str);
                }
                if (this.l >= 0) {
                    str2 = String.valueOf(str4);
                    str = String.valueOf(String.format("&pvideo_sec=%s", new Object[]{Long.valueOf(this.l)}));
                    str4 = str.length() == 0 ? new String(str2) : str2.concat(str);
                }
                if (this.m >= 0) {
                    str2 = String.valueOf(str4);
                    str = String.valueOf(String.format("&cp=%s", new Object[]{Integer.valueOf(this.m)}));
                    if (str.length() == 0) {
                        str4 = new String(str2);
                    } else {
                        str4 = str2.concat(str);
                    }
                }
                if (this.n) {
                    str2 = String.valueOf(str4);
                    str = "&ytbolding=1";
                    if (str.length() == 0) {
                        str4 = new String(str2);
                    } else {
                        str4 = str2.concat(str);
                    }
                }
                this.d = URLEncoder.encode(this.d, "UTF-8");
                str2 = String.valueOf(str4);
                valueOf = String.valueOf(String.format("&q=%s", new Object[]{this.d}));
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
            }
            abop abop = new abop(valueOf, this.o, this.p);
            if (isEmpty != 0) {
                String valueOf2 = String.valueOf(this.r);
                valueOf = "Bearer ";
                if (valueOf2.length() == 0) {
                    valueOf2 = new String(valueOf);
                } else {
                    valueOf2 = valueOf.concat(valueOf2);
                }
                abop.a("Authorization", valueOf2);
                if (!TextUtils.isEmpty(this.s)) {
                    abop.a("X-Goog-PageId", this.s);
                }
            } else if (!TextUtils.isEmpty(this.f)) {
                abop.a("X-Goog-Visitor-Id", this.f);
            }
            return abop;
        }
        throw new IllegalStateException();
    }
}
