package defpackage;

import android.util.Pair;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: xuc */
public final class xuc extends AbstractMap implements Map {
    public xuh[] a = new xuh[256];
    public volatile int b;
    private final ReferenceQueue c;
    private int d = 0;
    private final int e = 7500;
    private int f;
    private Set g;
    private Collection h;
    private final xum i;

    public xuc(xum xum) {
        amqw.a(true, (Object) "capacity < 0: 256");
        this.i = (xum) amqw.a((Object) xum);
        a();
        this.c = new ReferenceQueue();
    }

    public final void clear() {
        if (this.d > 0) {
            this.d = 0;
            Arrays.fill(this.a, null);
            this.b++;
            do {
            } while (this.c.poll() != null);
        }
    }

    private final void a() {
        this.f = (int) ((((long) this.a.length) * ((long) this.e)) / 10000);
    }

    public final boolean containsKey(Object obj) {
        return a(obj) != null;
    }

    public final Set entrySet() {
        b();
        return new xub(this);
    }

    public final Set keySet() {
        b();
        if (this.g == null) {
            this.g = new xud(this);
        }
        return this.g;
    }

    public final Collection values() {
        b();
        if (this.h == null) {
            this.h = new xuf(this);
        }
        return this.h;
    }

    public final Object get(Object obj) {
        b();
        if (obj != null) {
            int b = xuc.b(obj);
            xuh[] xuhArr = this.a;
            for (xuh xuh = xuhArr[(b & Integer.MAX_VALUE) % xuhArr.length]; xuh != null; xuh = xuh.d) {
                if (obj.equals(xuh.get())) {
                    return xuh.c;
                }
            }
            return null;
        }
        for (xuh xuh2 = this.a[0]; xuh2 != null; xuh2 = xuh2.d) {
            if (xuh2.b) {
                return xuh2.c;
            }
        }
        return null;
    }

    public final xuh a(Object obj) {
        b();
        if (obj != null) {
            int b = xuc.b(obj);
            xuh[] xuhArr = this.a;
            for (xuh xuh = xuhArr[(b & Integer.MAX_VALUE) % xuhArr.length]; xuh != null; xuh = xuh.d) {
                if (obj.equals(xuh.get())) {
                    return xuh;
                }
            }
            return null;
        }
        for (xuh xuh2 = this.a[0]; xuh2 != null; xuh2 = xuh2.d) {
            if (xuh2.b) {
                return xuh2;
            }
        }
        return null;
    }

    public final boolean containsValue(Object obj) {
        b();
        if (obj == null) {
            int length = this.a.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                xuh xuh = this.a[length];
                while (xuh != null) {
                    if ((xuh.get() != null || xuh.b) && xuh.c == null) {
                        return true;
                    }
                    xuh = xuh.d;
                }
            }
        } else {
            int length2 = this.a.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    break;
                }
                xuh xuh2 = this.a[length2];
                while (xuh2 != null) {
                    if ((xuh2.get() != null || xuh2.b) && obj.equals(xuh2.c)) {
                        return true;
                    }
                    xuh2 = xuh2.d;
                }
            }
        }
        return false;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    private final void b() {
        Set set = null;
        while (true) {
            xuh xuh = (xuh) this.c.poll();
            if (xuh == null) {
                break;
            }
            if (set == null) {
                set = new HashSet();
            }
            set.add(Pair.create(xuh, xuh.c));
            a(xuh);
        }
        if (set != null && !set.isEmpty()) {
            this.i.a(set);
        }
    }

    public final void a(xuh xuh) {
        int i = xuh.a;
        xuh[] xuhArr = this.a;
        i = (i & Integer.MAX_VALUE) % xuhArr.length;
        xuh xuh2 = xuhArr[i];
        xuh xuh3 = null;
        while (true) {
            xuh xuh4 = xuh3;
            xuh3 = xuh2;
            xuh2 = xuh4;
            if (xuh3 == null) {
                return;
            }
            if (xuh == xuh3) {
                this.b++;
                if (xuh2 == null) {
                    this.a[i] = xuh3.d;
                } else {
                    xuh2.d = xuh3.d;
                }
                this.d--;
                return;
            }
            xuh2 = xuh3.d;
        }
    }

    public final Object put(Object obj, Object obj2) {
        int b;
        xuh[] xuhArr;
        xuh xuh;
        b();
        int i = 0;
        if (obj != null) {
            b = xuc.b(obj);
            xuhArr = this.a;
            b = (b & Integer.MAX_VALUE) % xuhArr.length;
            xuh = xuhArr[b];
            while (xuh != null && !obj.equals(xuh.get())) {
                xuh = xuh.d;
            }
        } else {
            xuh = this.a[0];
            while (xuh != null && !xuh.b) {
                xuh = xuh.d;
            }
            b = 0;
        }
        if (xuh == null) {
            this.b++;
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 <= this.f) {
                i = b;
            } else {
                b = this.a.length;
                b += b;
                if (b == 0) {
                    b = 1;
                }
                xuhArr = new xuh[b];
                int i3 = 0;
                while (true) {
                    xuh[] xuhArr2 = this.a;
                    if (i3 >= xuhArr2.length) {
                        break;
                    }
                    xuh xuh2 = xuhArr2[i3];
                    while (xuh2 != null) {
                        int i4 = !xuh2.b ? (xuh2.a & Integer.MAX_VALUE) % b : 0;
                        xuh xuh3 = xuh2.d;
                        xuh2.d = xuhArr[i4];
                        xuhArr[i4] = xuh2;
                        xuh2 = xuh3;
                    }
                    i3++;
                }
                this.a = xuhArr;
                a();
                if (obj != null) {
                    i = (Integer.MAX_VALUE & xuc.b(obj)) % this.a.length;
                }
            }
            xuh xuh4 = new xuh(obj, obj2, this.c);
            xuh[] xuhArr3 = this.a;
            xuh4.d = xuhArr3[i];
            xuhArr3[i] = xuh4;
            return null;
        }
        obj = xuh.c;
        xuh.c = obj2;
        return obj;
    }

    public final void putAll(Map map) {
        if (map.entrySet() != null) {
            super.putAll(map);
        }
    }

    public final Object remove(Object obj) {
        xuh xuh;
        xuh xuh2;
        b();
        int i = 0;
        if (obj != null) {
            i = xuc.b(obj);
            xuh[] xuhArr = this.a;
            int length = (i & Integer.MAX_VALUE) % xuhArr.length;
            xuh xuh3 = xuhArr[length];
            xuh = null;
            while (xuh3 != null && !obj.equals(xuh3.get())) {
                xuh = xuh3;
                xuh3 = xuh3.d;
            }
            xuh2 = xuh3;
            i = length;
        } else {
            xuh2 = this.a[0];
            xuh = null;
            while (xuh2 != null && !xuh2.b) {
                xuh = xuh2;
                xuh2 = xuh2.d;
            }
        }
        if (xuh2 == null) {
            return null;
        }
        this.b++;
        if (xuh == null) {
            this.a[i] = xuh2.d;
        } else {
            xuh.d = xuh2.d;
        }
        this.d--;
        return xuh2.c;
    }

    public final int size() {
        b();
        return this.d;
    }

    public static int b(Object obj) {
        int hashCode = obj.hashCode();
        hashCode += (hashCode << 15) ^ -12931;
        hashCode ^= hashCode >>> 10;
        hashCode += hashCode << 3;
        hashCode ^= hashCode >>> 6;
        hashCode += (hashCode << 2) + (hashCode << 14);
        return hashCode ^ (hashCode >>> 16);
    }

    /* Access modifiers changed, original: protected|final */
    public final Object clone() {
        xuc xuc = (xuc) super.clone();
        xuc.g = null;
        xuc.h = null;
        return xuc;
    }
}
