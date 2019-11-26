package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: osr */
public final class osr extends ori {
    private static final Pattern a = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");
    private final boolean b;
    private int c;
    private int d;
    private int e;
    private int f;

    public osr() {
        this(null);
    }

    public osr(List list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.b = false;
            return;
        }
        this.b = true;
        String a = ozp.a((byte[]) list.get(0));
        oxz.a(a.startsWith("Format: "));
        a(a);
        osr.a(new oza((byte[]) list.get(1)));
    }

    private static void a(oza oza) {
        String s;
        do {
            s = oza.s();
            if (s == null) {
                return;
            }
        } while (!s.startsWith("[Events]"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    private final void a(java.lang.String r9) {
        /*
        r8 = this;
        r0 = 8;
        r9 = r9.substring(r0);
        r0 = ",";
        r9 = android.text.TextUtils.split(r9, r0);
        r0 = r9.length;
        r8.c = r0;
        r0 = -1;
        r8.d = r0;
        r8.e = r0;
        r8.f = r0;
        r1 = 0;
        r2 = 0;
    L_0x0018:
        r3 = r8.c;
        if (r2 >= r3) goto L_0x006d;
    L_0x001c:
        r3 = r9[r2];
        r3 = r3.trim();
        r3 = defpackage.ozp.d(r3);
        r4 = r3.hashCode();
        r5 = 100571; // 0x188db float:1.4093E-40 double:4.96887E-319;
        r6 = 2;
        r7 = 1;
        if (r4 == r5) goto L_0x0050;
    L_0x0031:
        r5 = 3556653; // 0x36452d float:4.983932E-39 double:1.75722E-317;
        if (r4 == r5) goto L_0x0046;
    L_0x0036:
        r5 = 109757538; // 0x68ac462 float:5.219839E-35 double:5.4227429E-316;
        if (r4 == r5) goto L_0x003c;
    L_0x003b:
        goto L_0x005a;
    L_0x003c:
        r4 = "start";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x005a;
    L_0x0044:
        r3 = 0;
        goto L_0x005b;
    L_0x0046:
        r4 = "text";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x005a;
    L_0x004e:
        r3 = 2;
        goto L_0x005b;
    L_0x0050:
        r4 = "end";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x005a;
    L_0x0058:
        r3 = 1;
        goto L_0x005b;
    L_0x005a:
        r3 = -1;
    L_0x005b:
        if (r3 == 0) goto L_0x0068;
    L_0x005d:
        if (r3 == r7) goto L_0x0065;
    L_0x005f:
        if (r3 == r6) goto L_0x0062;
    L_0x0061:
        goto L_0x006a;
    L_0x0062:
        r8.f = r2;
        goto L_0x006a;
    L_0x0065:
        r8.e = r2;
        goto L_0x006a;
    L_0x0068:
        r8.d = r2;
    L_0x006a:
        r2 = r2 + 1;
        goto L_0x0018;
    L_0x006d:
        r9 = r8.d;
        if (r9 == r0) goto L_0x0079;
    L_0x0071:
        r9 = r8.e;
        if (r9 == r0) goto L_0x0079;
    L_0x0075:
        r9 = r8.f;
        if (r9 != r0) goto L_0x007b;
    L_0x0079:
        r8.c = r1;
    L_0x007b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osr.a(java.lang.String):void");
    }

    private static long b(String str) {
        Matcher matcher = a.matcher(str);
        return matcher.matches() ? (((Long.parseLong(matcher.group(1)) * 3600000000L) + (Long.parseLong(matcher.group(2)) * 60000000)) + (Long.parseLong(matcher.group(3)) * 1000000)) + (Long.parseLong(matcher.group(4)) * 10000) : -9223372036854775807L;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ ork a(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        oys oys = new oys();
        oza oza = new oza(bArr, i);
        if (!this.b) {
            osr.a(oza);
        }
        while (true) {
            String s = oza.s();
            if (s == null) {
                orf[] orfArr = new orf[arrayList.size()];
                arrayList.toArray(orfArr);
                return new osu(orfArr, oys.a());
            } else if (!this.b && s.startsWith("Format: ")) {
                a(s);
            } else if (s.startsWith("Dialogue: ")) {
                String str = "SsaDecoder";
                String str2;
                if (this.c == 0) {
                    str2 = "Skipping dialogue line before complete format: ";
                    oyp.a(str, s.length() == 0 ? new String(str2) : str2.concat(s));
                } else {
                    String[] split = s.substring(10).split(",", this.c);
                    if (split.length != this.c) {
                        str2 = "Skipping dialogue line with fewer columns than format: ";
                        oyp.a(str, s.length() == 0 ? new String(str2) : str2.concat(s));
                    } else {
                        long b = osr.b(split[this.d]);
                        String str3 = "Skipping invalid timing: ";
                        if (b == -9223372036854775807L) {
                            oyp.a(str, s.length() == 0 ? new String(str3) : str3.concat(s));
                        } else {
                            long j;
                            String str4 = split[this.e];
                            if (str4.trim().isEmpty()) {
                                j = -9223372036854775807L;
                            } else {
                                j = osr.b(str4);
                                if (j == -9223372036854775807L) {
                                    oyp.a(str, s.length() == 0 ? new String(str3) : str3.concat(s));
                                }
                            }
                            s = split[this.f].replaceAll("\\{.*?\\}", "");
                            str2 = "\n";
                            arrayList.add(new orf(s.replaceAll("\\\\N", str2).replaceAll("\\\\n", str2)));
                            oys.a(b);
                            if (j != -9223372036854775807L) {
                                arrayList.add(null);
                                oys.a(j);
                            }
                        }
                    }
                }
            }
        }
    }
}
