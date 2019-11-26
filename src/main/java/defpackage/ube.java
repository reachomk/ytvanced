package defpackage;

import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: ube */
public final class ube {
    private static final Map a;
    private final ubl b;
    private final ByteBuffer c;
    private final ubs d = new ubs();
    private final ubs e = new ubs();
    private final ubu f = new ubu();
    private final ubu g = new ubu();
    private final Map h = new zj();
    private final ubs i = new ubs();
    private int j;
    private String k = "";
    private final ubu l = new ubu();
    private final ubu m = new ubu();
    private final uby n = new uby();

    public static ubn a(ubl ubl, Iterable iterable, Iterable iterable2, Iterable iterable3) {
        ube ube = new ube(ubl, iterable, iterable2, iterable3);
        while (true) {
            boolean z = true;
            int i;
            int position;
            int a;
            if (ube.c.hasRemaining()) {
                byte b = ube.c.get();
                ube.c.getInt();
                ByteBuffer byteBuffer = ube.c;
                int position2;
                int i2;
                int b2;
                ByteBuffer byteBuffer2;
                if (byteBuffer.getInt(byteBuffer.position()) < 0) {
                    throw new RuntimeException("Length too large to parse.");
                } else if (b == (byte) 1) {
                    position2 = ube.c.position();
                    i2 = ube.c.getInt();
                    ube.d.a(ube.b.a(), position2);
                    ubl = ube.b;
                    ubl.c(i2 - ubl.b);
                } else if (b == (byte) 2) {
                    Object obj;
                    ube.c.getInt();
                    ube.c.getInt();
                    position2 = ube.c.position();
                    i2 = ube.b.a();
                    ube.c.getInt();
                    b2 = ube.d.b(ube.b.a());
                    uax uax = new uax(position2, b2);
                    ube.f.a(i2, uax);
                    ubl = ube.b;
                    i = ubl.a.getInt(b2);
                    position2 = ubl.b;
                    b2 = (b2 + 4) + ube.b.b;
                    uby uby = ube.n;
                    byteBuffer2 = ube.c;
                    ubx ubx = uby.a;
                    i = (i - position2) + b2;
                    while (true) {
                        obj = null;
                        if (b2 < i) {
                            byte b3 = byteBuffer2.get(b2);
                            aaf aaf = ubx.b;
                            if (aaf != null) {
                                ubx = (ubx) aaf.a(b3);
                                if (ubx != null) {
                                    b2++;
                                }
                            }
                        } else {
                            obj = ubx.a;
                        }
                    }
                    ubd ubd = (ubd) obj;
                    if (ubd == ubd.IDENTIFY_OBJECT_CLASS) {
                        ube.j = i2;
                    } else if (ubd == ubd.IDENTIFY_JAVA_LANG_CLASS) {
                        uax.a = uax;
                    } else if (ubd == ubd.CLASSIFY_REF) {
                        uax.o |= 2;
                    } else if (ubd != null) {
                        ube.l.a(i2, ubd);
                    }
                } else if (b == (byte) 12 || b == (byte) 28) {
                    position = ube.c.position() + ube.c.getInt();
                    while (true) {
                        char c = 0;
                        if (ube.c.position() < position) {
                            position2 = ube.c.get() & 255;
                            if (ube.b.c.c(position2)) {
                                b2 = ube.b.c.b(position2);
                                if (ube.i.c(position2)) {
                                    ube.b.c(b2);
                                } else {
                                    ube.e.a(ube.b.a(), position2);
                                    ubl = ube.b;
                                    ubl.c(b2 - ubl.b);
                                }
                            } else {
                                ubd ubd2;
                                if (position2 != 195) {
                                    if (position2 != 254) {
                                        switch (position2) {
                                            case 32:
                                                position2 = ube.b.a();
                                                uax uax2;
                                                ubl ubl2;
                                                ubu ubu;
                                                ByteBuffer byteBuffer3;
                                                char c2;
                                                if (position2 != ube.j) {
                                                    char c3;
                                                    int[] iArr;
                                                    int[] iArr2;
                                                    uax2 = (uax) ube.f.b(position2);
                                                    ubl2 = ube.b;
                                                    ubu = ube.f;
                                                    ubs ubs = ube.d;
                                                    byteBuffer2 = ubl2.a;
                                                    uax2.k = byteBuffer2.position() - ubl2.b;
                                                    byteBuffer2.getInt();
                                                    uax2.g = (uax) ubu.b(ubl2.a());
                                                    ubl2.c(ubl2.b * 5);
                                                    uax2.i = byteBuffer2.getInt();
                                                    uax.d(ubl2);
                                                    byteBuffer3 = ubl2.a;
                                                    c2 = (char) byteBuffer3.getShort();
                                                    uax2.b = new int[c2];
                                                    uax2.c = new int[c2];
                                                    char c4 = 0;
                                                    for (c3 = 0; c3 < c2; c3++) {
                                                        int a2 = ubl2.a();
                                                        byte b4 = byteBuffer3.get();
                                                        uax2.j += ubl2.b(b4);
                                                        if (ubl.e(b4)) {
                                                            int a3 = ubl2.a();
                                                            if (a3 != 0) {
                                                                uax2.b[c4] = a3;
                                                                uax2.c[c4] = ubs.b(a2);
                                                                c4++;
                                                            }
                                                        } else {
                                                            ubl2.c(ubl2.b(b4));
                                                        }
                                                    }
                                                    if (c4 == c2) {
                                                        iArr = uax2.b;
                                                    } else {
                                                        iArr = Arrays.copyOf(uax2.b, c4);
                                                    }
                                                    uax2.b = iArr;
                                                    if (c4 == c2) {
                                                        iArr = uax2.c;
                                                    } else {
                                                        iArr = Arrays.copyOf(uax2.c, c4);
                                                    }
                                                    uax2.c = iArr;
                                                    byteBuffer3 = ubl2.a;
                                                    c2 = (char) byteBuffer3.getShort();
                                                    uax2.d = new int[c2];
                                                    uax2.e = new int[c2];
                                                    uax2.f = 0;
                                                    c3 = 0;
                                                    while (c < c2) {
                                                        int a4 = ubl2.a();
                                                        byte b5 = byteBuffer3.get();
                                                        if (ubl.e(b5)) {
                                                            uax2.d[c3] = ubs.b(a4);
                                                            uax2.e[c3] = uax2.f;
                                                            c3++;
                                                        }
                                                        uax2.f += ubl2.b(b5);
                                                        c++;
                                                    }
                                                    if (c3 == c2) {
                                                        iArr2 = uax2.d;
                                                    } else {
                                                        iArr2 = Arrays.copyOf(uax2.d, c3);
                                                    }
                                                    uax2.d = iArr2;
                                                    if (c3 == c2) {
                                                        iArr2 = uax2.e;
                                                    } else {
                                                        iArr2 = Arrays.copyOf(uax2.e, c3);
                                                    }
                                                    uax2.e = iArr2;
                                                    break;
                                                }
                                                uax2 = (uax) ube.f.b(position2);
                                                ubl2 = ube.b;
                                                ubu = ube.f;
                                                ByteBuffer byteBuffer4 = ubl2.a;
                                                uax2.k = byteBuffer4.position() - ubl2.b;
                                                byteBuffer4.getInt();
                                                uax2.g = (uax) ubu.b(ubl2.a());
                                                ubl2.c(ubl2.b * 5);
                                                uax2.i = byteBuffer4.getInt();
                                                uax.d(ubl2);
                                                byteBuffer3 = ubl2.a;
                                                char c5 = (char) byteBuffer3.getShort();
                                                for (c2 = 0; c2 < c5; c2++) {
                                                    ubl2.a();
                                                    ubl2.c(ubl2.b(byteBuffer3.get()));
                                                }
                                                uax2.b = new int[0];
                                                uax2.c = new int[0];
                                                byteBuffer3 = ubl2.a;
                                                c5 = (char) byteBuffer3.getShort();
                                                uax2.f = 0;
                                                for (c2 = 0; c2 < c5; c2++) {
                                                    ubl2.a();
                                                    uax2.f += ubl2.b(byteBuffer3.get());
                                                }
                                                uax2.d = new int[0];
                                                uax2.e = new int[0];
                                                break;
                                            case 33:
                                                position2 = ube.c.position();
                                                b2 = ube.b.a();
                                                ube.c.getInt();
                                                a = ube.b.a();
                                                i = ube.c.getInt();
                                                uax uax3 = (uax) ube.f.b(a);
                                                ubd ubd3 = (ubd) ube.l.b(a);
                                                if (!(uax3 == null || ubd3 == ubd.EXCLUDE_INSTANCE)) {
                                                    uba uba = new uba(position2, uax3);
                                                    uba.q = ube.k;
                                                    ube.g.a(b2, uba);
                                                    if (ubd3 == ubd.FIND_INSTANCE) {
                                                        String c6 = uax3.c(ube.b);
                                                        List list = (List) ube.h.get(c6);
                                                        if (list == null) {
                                                            list = new ArrayList();
                                                            ube.h.put(c6, list);
                                                        }
                                                        list.add(uba);
                                                    }
                                                }
                                                ube.b.c(i);
                                                break;
                                            case 34:
                                                position2 = ube.c.position();
                                                b2 = ube.b.a();
                                                ube.c.getInt();
                                                a = ube.c.getInt();
                                                i = ube.b.a();
                                                ubd2 = (ubd) ube.l.b(i);
                                                if (ube.f.c(i) && ubd2 != ubd.EXCLUDE_INSTANCE) {
                                                    uay uay = new uay(position2, (uax) ube.f.b(i));
                                                    uay.q = ube.k;
                                                    ube.g.a(b2, uay);
                                                }
                                                ubl = ube.b;
                                                ubl.c(a * ubl.b);
                                                break;
                                            case 35:
                                                break;
                                            default:
                                                StringBuilder stringBuilder = new StringBuilder(23);
                                                stringBuilder.append("Unknown tag ");
                                                stringBuilder.append(position2);
                                                throw new IllegalArgumentException(stringBuilder.toString());
                                        }
                                    }
                                    ube.c.getInt();
                                    ube.k = ube.b.a(ube.d.b(ube.b.a()));
                                }
                                position2 = ube.c.position();
                                b2 = ube.b.a();
                                ube.c.getInt();
                                a = ube.c.getInt();
                                byte b6 = ube.c.get();
                                ubd2 = (ubd) ube.m.b(b6);
                                ubl ubl3 = ube.b;
                                ubl3.c(a * ubl3.b(b6));
                                if (ubd2 != ubd.EXCLUDE_INSTANCE) {
                                    ubg ubg = new ubg(position2);
                                    ubg.q = ube.k;
                                    ube.g.a(b2, ubg);
                                }
                            }
                        } else {
                            if (ube.c.position() != position) {
                                z = false;
                            }
                            uhy.b(z);
                        }
                    }
                } else {
                    ube.b.c(ube.c.getInt());
                }
            } else {
                ubw b7 = ube.f.b();
                while (b7.a()) {
                    ((uax) b7.b).c();
                }
                ArrayList arrayList = new ArrayList();
                ubs ubs2 = ube.e;
                ubr ubr = new ubr(ubs2.c, ubs2.d, ubs2.b);
                while (true) {
                    ubr.f = ubr.c;
                    while (true) {
                        position = ubr.f;
                        a = ubr.c;
                        if (position == a) {
                            i = ubr.d;
                            int[] iArr3 = ubr.b;
                            if (i < iArr3.length) {
                                ubr.d = i + 1;
                                ubr.f = iArr3[i];
                            }
                        }
                    }
                    i = ubr.d;
                    if (i > 0) {
                        ubr.e = ubr.a[i - 1];
                    }
                    if (position != a) {
                        position = ubr.e;
                        ubb ubb = (ubb) ube.f.b(position);
                        if (ubb == null) {
                            ubb = (ubb) ube.g.b(position);
                            if (ubb == null) {
                            }
                        }
                        ubb.o |= 1;
                        ubb.p = ubr.f;
                        arrayList.add(ubb);
                    } else {
                        ube.d.a();
                        ube.l.a();
                        return new ubn(ube.f, ube.g, arrayList, ube.h);
                    }
                }
            }
        }
    }

    private ube(ubl ubl, Iterable iterable, Iterable iterable2, Iterable iterable3) {
        this.b = ubl;
        this.c = ubl.a;
        this.n.a(Reference.class.getName(), ubd.CLASSIFY_REF);
        this.n.a(Object.class.getName(), ubd.IDENTIFY_OBJECT_CLASS);
        this.n.a(Class.class.getName(), ubd.IDENTIFY_JAVA_LANG_CLASS);
        if (iterable2 != null) {
            for (String str : iterable2) {
                this.n.a(str, ubd.EXCLUDE_INSTANCE);
                if (a.containsKey(str)) {
                    this.m.a(((Integer) a.get(str)).intValue(), ubd.EXCLUDE_INSTANCE);
                }
            }
        }
        if (iterable3 != null) {
            for (String str2 : iterable3) {
                this.n.a(str2, ubd.FIND_INSTANCE);
            }
        }
        if (iterable != null) {
            for (Integer intValue : iterable) {
                this.i.a(intValue.intValue(), 0);
            }
        }
    }

    static {
        zj zjVar = new zj();
        a = zjVar;
        zjVar.put("boolean[]", Integer.valueOf(4));
        a.put("char[]", Integer.valueOf(5));
        a.put("float[]", Integer.valueOf(6));
        a.put("double[]", Integer.valueOf(7));
        a.put("byte[]", Integer.valueOf(8));
        a.put("short[]", Integer.valueOf(9));
        a.put("int[]", Integer.valueOf(10));
        a.put("long[]", Integer.valueOf(11));
    }
}
