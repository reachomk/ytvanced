package defpackage;

import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan.Standard;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

/* renamed from: osz */
final class osz {
    public final long a;
    public final long b;
    public final String c;
    private final String d;
    private final String e;
    private final boolean f;
    private final otb g;
    private final String[] h;
    private final String i;
    private final HashMap j;
    private final HashMap k;
    private List l;

    public osz(String str, String str2, long j, long j2, otb otb, String[] strArr, String str3, String str4) {
        this.d = str;
        this.e = str2;
        this.i = str4;
        this.g = otb;
        this.h = strArr;
        this.f = str2 != null;
        this.a = j;
        this.b = j2;
        this.c = (String) oxz.a((Object) str3);
        this.j = new HashMap();
        this.k = new HashMap();
    }

    private final boolean a(long j) {
        long j2 = this.a;
        boolean z = true;
        if (!(j2 == -9223372036854775807L && this.b == -9223372036854775807L) && ((j2 > j || this.b != -9223372036854775807L) && (j2 != -9223372036854775807L || j >= this.b))) {
            if (j2 <= j) {
                return j < this.b ? z : false;
            } else {
                z = false;
            }
        }
    }

    public final void a(osz osz) {
        if (this.l == null) {
            this.l = new ArrayList();
        }
        this.l.add(osz);
    }

    private final osz a(int i) {
        List list = this.l;
        if (list != null) {
            return (osz) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    private final int a() {
        List list = this.l;
        return list != null ? list.size() : 0;
    }

    public final void a(TreeSet treeSet, boolean z) {
        boolean equals = "p".equals(this.d);
        boolean equals2 = "div".equals(this.d);
        if (z || equals || (equals2 && this.i != null)) {
            long j = this.a;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            j = this.b;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
        }
        if (this.l != null) {
            for (int i = 0; i < this.l.size(); i++) {
                osz osz = (osz) this.l.get(i);
                boolean z2 = true;
                if (!(z || equals)) {
                    z2 = false;
                }
                osz.a(treeSet, z2);
            }
        }
    }

    public final void a(long j, String str, List list) {
        if (!"".equals(this.c)) {
            str = this.c;
        }
        int i = 0;
        if (a(j)) {
            if ("div".equals(this.d)) {
                String str2 = this.i;
                if (str2 != null) {
                    list.add(new Pair(str, str2));
                    return;
                }
            }
        }
        while (i < a()) {
            a(i).a(j, str, list);
            i++;
        }
    }

    public final void a(long j, boolean z, String str, Map map) {
        this.j.clear();
        this.k.clear();
        if (!"metadata".equals(this.d)) {
            if (!"".equals(this.c)) {
                str = this.c;
            }
            if (this.f && z) {
                osz.a(str, map).append(this.e);
                return;
            }
            if ("br".equals(this.d) && z) {
                osz.a(str, map).append(10);
            } else if (a(j)) {
                for (Entry entry : map.entrySet()) {
                    this.j.put((String) entry.getKey(), Integer.valueOf(((SpannableStringBuilder) entry.getValue()).length()));
                }
                boolean equals = "p".equals(this.d);
                for (int i = 0; i < a(); i++) {
                    osz a = a(i);
                    boolean z2 = z || equals;
                    a.a(j, z2, str, map);
                }
                if (equals) {
                    SpannableStringBuilder a2 = osz.a(str, map);
                    int length = a2.length();
                    while (true) {
                        length--;
                        if (length < 0 || a2.charAt(length) != ' ') {
                            if (length >= 0 && a2.charAt(length) != 10) {
                                a2.append(10);
                            }
                        }
                    }
                    a2.append(10);
                }
                for (Entry entry2 : map.entrySet()) {
                    this.k.put((String) entry2.getKey(), Integer.valueOf(((SpannableStringBuilder) entry2.getValue()).length()));
                }
            }
        }
    }

    private static SpannableStringBuilder a(String str, Map map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return (SpannableStringBuilder) map.get(str);
    }

    public final void a(long j, Map map, Map map2) {
        if (a(j)) {
            int i;
            Iterator it = this.k.entrySet().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                String str = (String) entry.getKey();
                int intValue = this.j.containsKey(str) ? ((Integer) this.j.get(str)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) map2.get(str);
                    otb otb = this.g;
                    String[] strArr = this.h;
                    if (otb == null && strArr == null) {
                        otb = null;
                    } else if (otb == null && strArr.length == 1) {
                        otb = (otb) map.get(strArr[0]);
                    } else {
                        int length;
                        if (otb == null) {
                            length = strArr.length;
                            if (length > 1) {
                                otb = new otb();
                                while (i < length) {
                                    otb.a((otb) map.get(strArr[i]));
                                    i++;
                                }
                            }
                        }
                        if (otb != null && strArr != null && strArr.length == 1) {
                            otb.a((otb) map.get(strArr[0]));
                        } else if (!(otb == null || strArr == null)) {
                            length = strArr.length;
                            if (length > 1) {
                                while (i < length) {
                                    otb.a((otb) map.get(strArr[i]));
                                    i++;
                                }
                            }
                        }
                    }
                    if (otb != null) {
                        if (otb.a() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(otb.a()), intValue, intValue2, 33);
                        }
                        if (otb.f == 1) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                        }
                        if (otb.g == 1) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                        }
                        if (otb.c) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(otb.b), intValue, intValue2, 33);
                        }
                        if (otb.e) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(otb.d), intValue, intValue2, 33);
                        }
                        String str2 = otb.a;
                        if (str2 != null) {
                            spannableStringBuilder.setSpan(new TypefaceSpan(str2), intValue, intValue2, 33);
                        }
                        Alignment alignment = otb.m;
                        if (alignment != null) {
                            spannableStringBuilder.setSpan(new Standard(alignment), intValue, intValue2, 33);
                        }
                        i = otb.j;
                        if (i == 1) {
                            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) otb.k, true), intValue, intValue2, 33);
                        } else if (i == 2) {
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(otb.k), intValue, intValue2, 33);
                        } else if (i == 3) {
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(otb.k / 100.0f), intValue, intValue2, 33);
                        }
                    }
                }
            }
            while (i < a()) {
                a(i).a(j, map, map2);
                i++;
            }
        }
    }
}
