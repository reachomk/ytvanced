package defpackage;

import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: ote */
final class ote implements ork {
    private final osz a;
    private final long[] b;
    private final Map c;
    private final Map d;
    private final Map e;

    public ote(osz osz, Map map, Map map2, Map map3) {
        this.a = osz;
        this.d = map2;
        this.e = map3;
        this.c = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        osz.a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            jArr[i] = ((Long) it.next()).longValue();
            i = i2;
        }
        this.b = jArr;
    }

    public final int a(long j) {
        int a = ozp.a(this.b, j, false, false);
        return a >= this.b.length ? -1 : a;
    }

    public final int a() {
        return this.b.length;
    }

    public final long a(int i) {
        return this.b[i];
    }

    public final List b(long j) {
        otc otc;
        osz osz = this.a;
        Map map = this.c;
        Map map2 = this.d;
        Map map3 = this.e;
        List arrayList = new ArrayList();
        osz.a(j, osz.c, arrayList);
        Map treeMap = new TreeMap();
        osz.a(j, false, osz.c, treeMap);
        osz.a(j, map, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                BitmapFactory.decodeByteArray(decode, 0, decode.length);
                otc = (otc) map2.get(pair.first);
                arrayList2.add(new orf(otc.b, 1, otc.c));
            }
        }
        for (Entry entry : treeMap.entrySet()) {
            int i2;
            int i3;
            int i4;
            otc = (otc) map2.get(entry.getKey());
            CharSequence charSequence = (SpannableStringBuilder) entry.getValue();
            int length = charSequence.length();
            for (i2 = 0; i2 < length; i2++) {
                if (charSequence.charAt(i2) == ' ') {
                    i3 = i2 + 1;
                    i4 = i3;
                    while (i4 < charSequence.length() && charSequence.charAt(i4) == ' ') {
                        i4++;
                    }
                    i4 -= i3;
                    if (i4 > 0) {
                        charSequence.delete(i2, i2 + i4);
                        length -= i4;
                    }
                }
            }
            if (length > 0 && charSequence.charAt(0) == ' ') {
                charSequence.delete(0, 1);
                length--;
            }
            i2 = 0;
            while (true) {
                i3 = length - 1;
                if (i2 >= i3) {
                    break;
                }
                if (charSequence.charAt(i2) == 10) {
                    i4 = i2 + 1;
                    if (charSequence.charAt(i4) == ' ') {
                        charSequence.delete(i4, i2 + 2);
                        length = i3;
                    }
                }
                i2++;
            }
            if (length > 0 && charSequence.charAt(i3) == ' ') {
                charSequence.delete(i3, length);
                length = i3;
            }
            i2 = 0;
            while (true) {
                i3 = length - 1;
                if (i2 >= i3) {
                    break;
                }
                if (charSequence.charAt(i2) == ' ') {
                    int i5 = i2 + 1;
                    if (charSequence.charAt(i5) == 10) {
                        charSequence.delete(i2, i5);
                        length = i3;
                    }
                }
                i2++;
            }
            if (length > 0 && charSequence.charAt(i3) == 10) {
                charSequence.delete(i3, length);
            }
            arrayList2.add(new orf(charSequence, otc.c, otc.b));
        }
        return arrayList2;
    }
}
