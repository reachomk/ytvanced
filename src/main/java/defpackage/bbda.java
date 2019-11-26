package defpackage;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bbda */
public final class bbda {
    private static final Logger a = Logger.getLogger(bbda.class.getName());

    private bbda() {
    }

    public static Object a(String str) {
        anrx anrx = new anrx(new StringReader(str));
        try {
            Object a = bbda.a(anrx);
            return a;
        } finally {
            try {
                anrx.close();
            } catch (IOException e) {
                a.logp(Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", e);
            }
        }
    }

    private static Object a(anrx anrx) {
        amqw.b(anrx.a(), (Object) "unexpected end of JSON");
        int f = anrx.f();
        int i = f - 1;
        if (f != 0) {
            String str = "Bad token: ";
            boolean z = true;
            StringBuilder stringBuilder;
            boolean z2;
            int[] iArr;
            if (i != 0) {
                char c = '\"';
                int i2;
                int[] iArr2;
                if (i == 2) {
                    i = anrx.d;
                    if (i == 0) {
                        i = anrx.b();
                    }
                    if (i == 1) {
                        Object str2;
                        anrx.a(3);
                        anrx.d = 0;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        while (anrx.a()) {
                            Object c2;
                            i = anrx.d;
                            if (i == 0) {
                                i = anrx.b();
                            }
                            if (i == 14) {
                                c2 = anrx.c();
                            } else if (i == 12) {
                                c2 = anrx.a('\'');
                            } else if (i == 13) {
                                c2 = anrx.a('\"');
                            } else {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Expected a name but was ");
                                stringBuilder.append(anrz.a(anrx.f()));
                                stringBuilder.append(anrx.d());
                                throw new IllegalStateException(stringBuilder.toString());
                            }
                            anrx.d = 0;
                            anrx.i[anrx.h - 1] = c2;
                            linkedHashMap.put(c2, bbda.a(anrx));
                        }
                        z2 = anrx.f() == 4;
                        String valueOf = String.valueOf(anrx.e());
                        if (valueOf.length() == 0) {
                            str2 = new String(str);
                        } else {
                            str2 = str.concat(valueOf);
                        }
                        amqw.b(z2, str2);
                        i = anrx.d;
                        if (i == 0) {
                            i = anrx.b();
                        }
                        if (i == 2) {
                            i = anrx.h - 1;
                            anrx.h = i;
                            anrx.i[i] = null;
                            iArr = anrx.j;
                            i--;
                            iArr[i] = iArr[i] + 1;
                            anrx.d = 0;
                            return Collections.unmodifiableMap(linkedHashMap);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Expected END_OBJECT but was ");
                        stringBuilder.append(anrz.a(anrx.f()));
                        stringBuilder.append(anrx.d());
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Expected BEGIN_OBJECT but was ");
                    stringBuilder.append(anrz.a(anrx.f()));
                    stringBuilder.append(anrx.d());
                    throw new IllegalStateException(stringBuilder.toString());
                } else if (i == 5) {
                    Object c3;
                    i = anrx.d;
                    if (i == 0) {
                        i = anrx.b();
                    }
                    if (i == 10) {
                        c3 = anrx.c();
                    } else if (i == 8) {
                        c3 = anrx.a('\'');
                    } else if (i == 9) {
                        c3 = anrx.a('\"');
                    } else if (i == 11) {
                        c3 = anrx.g;
                        anrx.g = null;
                    } else if (i == 15) {
                        c3 = Long.toString(anrx.e);
                    } else if (i == 16) {
                        c3 = new String(anrx.b, anrx.c, anrx.f);
                        anrx.c += anrx.f;
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Expected a string but was ");
                        stringBuilder.append(anrz.a(anrx.f()));
                        stringBuilder.append(anrx.d());
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    anrx.d = 0;
                    int[] iArr3 = anrx.j;
                    i2 = anrx.h - 1;
                    iArr3[i2] = iArr3[i2] + 1;
                    return c3;
                } else if (i == 6) {
                    double d;
                    i = anrx.d;
                    if (i == 0) {
                        i = anrx.b();
                    }
                    if (i == 15) {
                        anrx.d = 0;
                        iArr2 = anrx.j;
                        i = anrx.h - 1;
                        iArr2[i] = iArr2[i] + 1;
                        d = (double) anrx.e;
                    } else {
                        if (i == 16) {
                            anrx.g = new String(anrx.b, anrx.c, anrx.f);
                            anrx.c += anrx.f;
                        } else if (i == 8 || i == 9) {
                            if (i == 8) {
                                c = '\'';
                            }
                            anrx.g = anrx.a(c);
                        } else if (i == 10) {
                            anrx.g = anrx.c();
                        } else if (i != 11) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Expected a double but was ");
                            stringBuilder.append(anrz.a(anrx.f()));
                            stringBuilder.append(anrx.d());
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                        anrx.d = 11;
                        d = Double.parseDouble(anrx.g);
                        boolean z3 = anrx.a;
                        if (Double.isNaN(d) || Double.isInfinite(d)) {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("JSON forbids NaN and infinities: ");
                            stringBuilder2.append(d);
                            stringBuilder2.append(anrx.d());
                            throw new anry(stringBuilder2.toString());
                        }
                        anrx.g = null;
                        anrx.d = 0;
                        iArr = anrx.j;
                        i2 = anrx.h - 1;
                        iArr[i2] = iArr[i2] + 1;
                    }
                    return Double.valueOf(d);
                } else if (i == 7) {
                    f = anrx.d;
                    if (f == 0) {
                        f = anrx.b();
                    }
                    if (f == 5) {
                        anrx.d = 0;
                        iArr2 = anrx.j;
                        i2 = anrx.h - 1;
                        iArr2[i2] = iArr2[i2] + 1;
                    } else if (f == 6) {
                        anrx.d = 0;
                        iArr2 = anrx.j;
                        i2 = anrx.h - 1;
                        iArr2[i2] = iArr2[i2] + 1;
                        z = false;
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Expected a boolean but was ");
                        stringBuilder.append(anrz.a(anrx.f()));
                        stringBuilder.append(anrx.d());
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    return Boolean.valueOf(z);
                } else if (i != 8) {
                    String valueOf2 = String.valueOf(anrx.e());
                    throw new IllegalStateException(valueOf2.length() == 0 ? new String(str) : str.concat(valueOf2));
                } else {
                    i = anrx.d;
                    if (i == 0) {
                        i = anrx.b();
                    }
                    if (i == 7) {
                        anrx.d = 0;
                        iArr2 = anrx.j;
                        i2 = anrx.h - 1;
                        iArr2[i2] = iArr2[i2] + 1;
                        return null;
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Expected null but was ");
                    stringBuilder.append(anrz.a(anrx.f()));
                    stringBuilder.append(anrx.d());
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            i = anrx.d;
            if (i == 0) {
                i = anrx.b();
            }
            if (i == 3) {
                Object str3;
                anrx.a(1);
                anrx.j[anrx.h - 1] = 0;
                anrx.d = 0;
                ArrayList arrayList = new ArrayList();
                while (anrx.a()) {
                    arrayList.add(bbda.a(anrx));
                }
                z2 = anrx.f() == 2;
                String valueOf3 = String.valueOf(anrx.e());
                if (valueOf3.length() == 0) {
                    str3 = new String(str);
                } else {
                    str3 = str.concat(valueOf3);
                }
                amqw.b(z2, str3);
                i = anrx.d;
                if (i == 0) {
                    i = anrx.b();
                }
                if (i == 4) {
                    i = anrx.h - 1;
                    anrx.h = i;
                    iArr = anrx.j;
                    i--;
                    iArr[i] = iArr[i] + 1;
                    anrx.d = 0;
                    return Collections.unmodifiableList(arrayList);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Expected END_ARRAY but was ");
                stringBuilder.append(anrz.a(anrx.f()));
                stringBuilder.append(anrx.d());
                throw new IllegalStateException(stringBuilder.toString());
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Expected BEGIN_ARRAY but was ");
            stringBuilder.append(anrz.a(anrx.f()));
            stringBuilder.append(anrx.d());
            throw new IllegalStateException(stringBuilder.toString());
        }
        throw null;
    }
}
