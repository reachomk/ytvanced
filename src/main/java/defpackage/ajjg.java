package defpackage;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* renamed from: ajjg */
public final class ajjg {
    public transient List a;
    private final List b;

    ajjg(List list) {
        this.b = Collections.unmodifiableList(list);
        TreeSet treeSet = new TreeSet();
        for (int i = 0; i < this.b.size(); i++) {
            ajiw ajiw = (ajiw) this.b.get(i);
            treeSet.addAll(ajiw.b.a);
            treeSet.addAll(ajiw.b.b);
            treeSet.addAll(ajiw.c.a);
        }
        this.a = Collections.unmodifiableList(new ArrayList(treeSet));
    }

    public static List a(xsd xsd, long j) {
        return amul.a((Object) new ajit(j, j, new ArrayList(), xsd));
    }

    public final List a(long j) {
        ajjg ajjg = this;
        long j2 = j;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < ajjg.b.size()) {
            Pair pair;
            ajiw ajiw = (ajiw) ajjg.b.get(i);
            ajiy a = ajiw.c.a(j2);
            if (a == null || !a.f) {
                ajje ajje = ajiw.b;
                int a2 = ajje.a(j2, false);
                if (a2 == -1) {
                    pair = new Pair(null, null);
                } else {
                    CharSequence charSequence = (CharSequence) ajje.c.get(a2);
                    long longValue = ((Long) ajje.b.get(a2)).longValue();
                    while (true) {
                        int i2 = a2 + 1;
                        if (i2 >= ajje.a.size() || ((Long) ajje.b.get(i2)).longValue() != longValue) {
                            pair = new Pair(charSequence, (CharSequence) ajje.c.get(a2));
                        } else {
                            a2 = i2;
                        }
                    }
                    pair = new Pair(charSequence, (CharSequence) ajje.c.get(a2));
                }
            } else {
                ajje ajje2 = ajiw.b;
                int a3 = ajje2.a(j2, true);
                if (a3 == -1) {
                    pair = new Pair(null, null);
                } else {
                    long longValue2;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    while (true) {
                        int i3 = a3 + 1;
                        if (i3 >= ajje2.a.size() || ((Long) ajje2.a.get(i3)).longValue() > j2 || ((Long) ajje2.b.get(i3)).longValue() <= j2) {
                            spannableStringBuilder.append((CharSequence) ajje2.c.get(a3));
                            longValue2 = ((Long) ajje2.b.get(a3)).longValue();
                        } else {
                            CharSequence charSequence2 = (CharSequence) ajje2.c.get(a3);
                            if (charSequence2.length() > 0 && charSequence2.charAt(charSequence2.length() - 1) == 10) {
                                spannableStringBuilder.append(charSequence2);
                                spannableStringBuilder2.append(charSequence2);
                            }
                            a3 = i3;
                        }
                    }
                    spannableStringBuilder.append((CharSequence) ajje2.c.get(a3));
                    longValue2 = ((Long) ajje2.b.get(a3)).longValue();
                    while (a3 < ajje2.a.size() && ((Long) ajje2.b.get(a3)).longValue() == longValue2) {
                        CharSequence charSequence3 = (CharSequence) ajje2.c.get(a3);
                        if (charSequence3.length() <= 0 || charSequence3.charAt(charSequence3.length() - 1) != 10) {
                            a3++;
                            if (a3 < ajje2.a.size() && ((Long) ajje2.b.get(a3)).longValue() <= longValue2) {
                            }
                        }
                        spannableStringBuilder2.append(charSequence3);
                    }
                    pair = new Pair(spannableStringBuilder, spannableStringBuilder2);
                }
            }
            arrayList.add(new ajjc(ajiw.a, j, (CharSequence) pair.first, (CharSequence) pair.second, a));
            i++;
            ajjg = this;
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.b.size(); i++) {
            stringBuilder.append("[");
            stringBuilder.append(((ajiw) this.b.get(i)).toString());
            stringBuilder.append("]");
        }
        return stringBuilder.toString();
    }
}
