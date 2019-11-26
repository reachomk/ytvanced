package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ajif */
public final class ajif implements ajid {
    private static final Pattern a = Pattern.compile("X-TIMESTAMP-MAP=LOCAL:\\S+,MPEGTS:(\\d+)", 2);
    private final oto b = new oto();
    private final xsd c;

    public ajif(xsd xsd) {
        this.c = xsd;
    }

    public final boolean a(ajij ajij, oza oza, afhr afhr) {
        ajij ajij2 = ajij;
        List arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        try {
            if ("WEBVTT".equals(oza.s())) {
                String s = oza.s();
                long j = 0;
                while (true) {
                    if (s != null && s.isEmpty()) {
                        break;
                    }
                    oza oza2 = oza;
                    if (s.startsWith("X-TIMESTAMP-MAP")) {
                        Matcher matcher = a.matcher(s);
                        double parseLong = (double) (matcher.matches() ? Long.parseLong(matcher.group(1)) : 0);
                        Double.isNaN(parseLong);
                        j = (long) (parseLong * 11.1111111d);
                    }
                    s = oza.s();
                }
                ajie ajie = new ajie(j);
                while (true) {
                    if (!this.b.a(oza, ajie, Collections.emptyList())) {
                        break;
                    }
                    arrayList2.add(ajie.b());
                    ajie.a();
                }
                ajij2.a(j / 1000);
                long size = (long) arrayList2.size();
                otj otj = (otj) arrayList2.get(0);
                long j2 = otj.e;
                List arrayList3 = new ArrayList();
                long j3 = j2;
                while (true) {
                    long j4 = (long) i;
                    if (j4 >= size) {
                        break;
                    }
                    long j5;
                    long j6 = j3;
                    long j7 = otj.f;
                    String str = "";
                    String valueOf = String.valueOf(otj.a);
                    otj otj2 = otj;
                    StringBuilder stringBuilder = new StringBuilder(str.length() + valueOf.length());
                    stringBuilder.append(str);
                    stringBuilder.append(valueOf);
                    CharSequence stringBuilder2 = stringBuilder.toString();
                    long j8 = size - 1;
                    if (j4 < j8) {
                        int i2 = i + 1;
                        while (((long) i2) < size) {
                            otj otj3 = (otj) arrayList2.get(i2);
                            j5 = j4;
                            long j9 = otj3.e;
                            if (j9 > j7) {
                                break;
                            }
                            if (j9 > j6) {
                                j7 = j9;
                            }
                            if (j9 <= j6 && otj3.f >= r10) {
                                String valueOf2 = String.valueOf(String.valueOf(stringBuilder2).concat("\n"));
                                valueOf = String.valueOf(otj3.a);
                                StringBuilder stringBuilder3 = new StringBuilder(valueOf2.length() + valueOf.length());
                                stringBuilder3.append(valueOf2);
                                stringBuilder3.append(valueOf);
                                stringBuilder2 = stringBuilder3.toString();
                            }
                            i2++;
                            j4 = j5;
                        }
                    }
                    j5 = j4;
                    CharSequence charSequence = stringBuilder2;
                    long j10 = j7;
                    long j11 = j6;
                    arrayList3.add(new ajjc(0, TimeUnit.MICROSECONDS.toMillis(j11), charSequence, charSequence, ajiy.a));
                    arrayList.add(new ajit(TimeUnit.MICROSECONDS.toMillis(j11), TimeUnit.MICROSECONDS.toMillis(j10), arrayList3, this.c));
                    if (j5 == j8) {
                        break;
                    }
                    arrayList3 = new ArrayList();
                    otj = otj2;
                    j3 = j10;
                    while (j3 >= otj.f) {
                        i++;
                        if (((long) i) >= size) {
                            break;
                        }
                        otj = (otj) arrayList2.get(i);
                        j3 = Math.max(j3, otj.e);
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList = ajjg.a(this.c, ajic.a(afhr));
                }
                ajij2.b = arrayList;
                return true;
            }
            throw new oae("Missing WEBVTT header");
        } catch (oae unused) {
            ajij2.b = ajjg.a(null, ajic.a(afhr));
            return false;
        }
    }
}
