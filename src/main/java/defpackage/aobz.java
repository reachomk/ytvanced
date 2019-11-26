package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aobz */
public class aobz {
    public final int a;
    public final Class b;
    public final int c;
    public final boolean d;
    private final anxl e;

    public static aobz a(Class cls, long j) {
        return new aobz(11, cls, (int) j, false);
    }

    public static aobz a(Class cls, anxl anxl, long j) {
        return new aobz(11, cls, anxl, (int) j, false);
    }

    public static aobz a(int i, Class cls, long j) {
        return new aocc(i, cls, (int) j);
    }

    public aobz(int i, Class cls, int i2, boolean z) {
        this(i, cls, null, i2, z);
    }

    private aobz(int i, Class cls, anxl anxl, int i2, boolean z) {
        this.a = i;
        this.b = cls;
        this.c = i2;
        this.d = z;
        this.e = anxl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aobz) {
            aobz aobz = (aobz) obj;
            return this.a == aobz.a && this.b == aobz.b && this.c == aobz.c && this.d == aobz.d;
        }
    }

    public final int hashCode() {
        return ((((((this.a + 1147) * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d;
    }

    /* Access modifiers changed, original: final */
    public final Object a(List list) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        if (this.d) {
            List arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                aoch aoch = (aoch) list.get(i);
                if (aoch.b.length != 0) {
                    a(aoch, arrayList);
                }
            }
            int size = arrayList.size();
            if (size != 0) {
                Class cls = this.b;
                obj = cls.cast(Array.newInstance(cls.getComponentType(), size));
                for (int i2 = 0; i2 < size; i2++) {
                    Array.set(obj, i2, arrayList.get(i2));
                }
            }
        } else if (!list.isEmpty()) {
            return this.b.cast(a(aobv.a(((aoch) list.get(list.size() - 1)).b)));
        }
        return obj;
    }

    /* Access modifiers changed, original: protected */
    public Object a(aobv aobv) {
        String valueOf;
        StringBuilder stringBuilder;
        String str = "Error creating instance of class ";
        Class componentType = this.d ? this.b.getComponentType() : this.b;
        try {
            int i = this.a;
            anxl anxl;
            aocf aocf;
            if (i == 10) {
                anxl = this.e;
                if (anxl != null) {
                    anxl = (anxl) aobv.j().a(aock.b(this.c), anxl.getParserForType(), anxa.c());
                    aobv.b(aobv.c);
                    return anxl;
                }
                aocf = (aocf) componentType.newInstance();
                int b = aock.b(this.c);
                int i2 = aobv.d;
                if (i2 < aobv.e) {
                    aobv.d = i2 + 1;
                    aocf.mergeFrom(aobv);
                    aobv.a(aock.a(b, 4));
                    aobv.d--;
                    return aocf;
                }
                throw aocg.d();
            } else if (i == 11) {
                anxl = this.e;
                if (anxl != null) {
                    return aobv.a(anxl.getParserForType());
                }
                aocf = (aocf) componentType.newInstance();
                aobv.a(aocf);
                return aocf;
            } else {
                StringBuilder stringBuilder2 = new StringBuilder(24);
                stringBuilder2.append("Unknown type ");
                stringBuilder2.append(i);
                throw new IllegalArgumentException(stringBuilder2.toString());
            }
        } catch (anyg e) {
            throw new aocg("", e);
        } catch (InstantiationException e2) {
            valueOf = String.valueOf(componentType);
            stringBuilder = new StringBuilder(valueOf.length() + 33);
            stringBuilder.append(str);
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString(), e2);
        } catch (IllegalAccessException e3) {
            valueOf = String.valueOf(componentType);
            stringBuilder = new StringBuilder(valueOf.length() + 33);
            stringBuilder.append(str);
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString(), e3);
        } catch (IOException e4) {
            throw new IllegalArgumentException("Error reading extension field", e4);
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(aoch aoch, List list) {
        list.add(a(aobv.a(aoch.b)));
    }

    /* Access modifiers changed, original: protected */
    public void a(Object obj, aoby aoby) {
        try {
            aoby.i(this.c);
            int i = this.a;
            anze anze;
            if (i == 10) {
                i = aock.b(this.c);
                if (this.e == null) {
                    ((aocf) obj).writeTo(aoby);
                } else {
                    anze = (anze) obj;
                    anwm a = aoby.a();
                    anze.writeTo(a);
                    a.i();
                    aoby.b = aoby.a.position();
                }
                aoby.e(i, 4);
            } else if (i != 11) {
                StringBuilder stringBuilder = new StringBuilder(24);
                stringBuilder.append("Unknown type ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (this.e == null) {
                aoby.a((aocf) obj);
            } else {
                anze = (anze) obj;
                aoby.i(anze.getSerializedSize());
                anwm a2 = aoby.a();
                anze.writeTo(a2);
                a2.i();
                aoby.b = aoby.a.position();
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* Access modifiers changed, original: protected */
    public void b(Object obj, aoby aoby) {
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                a(obj2, aoby);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public int a(Object obj) {
        int length = Array.getLength(obj);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj2 = Array.get(obj, i2);
            if (obj2 != null) {
                i += b(obj2);
            }
        }
        return i;
    }

    /* Access modifiers changed, original: protected */
    public int b(Object obj) {
        int b = aock.b(this.c);
        int i = this.a;
        if (i == 10) {
            int serializedSize;
            if (this.e == null) {
                aocf aocf = (aocf) obj;
                b = aoby.h(b);
                b += b;
                serializedSize = aocf.getSerializedSize();
            } else {
                anze anze = (anze) obj;
                b = anwm.o(b);
                b += b;
                serializedSize = anwm.d(anze);
            }
            return b + serializedSize;
        } else if (i != 11) {
            StringBuilder stringBuilder = new StringBuilder(24);
            stringBuilder.append("Unknown type ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.e == null) {
            return aoby.b(b, (aocf) obj);
        } else {
            return anwm.c(b, (anze) obj);
        }
    }

    /* synthetic */ aobz(int i, Class cls, int i2) {
        this(i, cls, i2, false);
    }
}
