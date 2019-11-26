package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: cvz */
public final class cvz {
    private static final List c = new ArrayList();
    public cvx a;
    public final List b = new ArrayList();

    public static cvx a(cwj cwj, cwh cwh, cwh cwh2, List list, cxd cxd, String str, String str2, String str3, String str4) {
        cwh cwh3 = cwh;
        cwh cwh4 = cwh2;
        int i = 0;
        Object obj = cwh3 != null ? null : 1;
        int i2;
        cvx a;
        if (obj != null && cwh4 == null) {
            throw new IllegalStateException("Both currentRoot and newRoot are null.");
        } else if (cwh4 == null) {
            i2 = cwh3.g;
            list.add(cwh3);
            a = cvx.a(cwh3.g, cwh4);
            while (i < i2) {
                a.a(cvy.a(null));
                i++;
            }
            return a;
        } else {
            List list2 = list;
            String a2 = cvz.a(cwh3, str2);
            String a3 = cvz.a(cwh4, str3);
            if (cwh3 == null || cwm.a(cwh, cwh2)) {
                cxd.a(str, cwh, cwh2, a2, a3, Boolean.valueOf(true), str4);
                if (cwh2.b()) {
                    boolean d = cno.d();
                    if (d) {
                        cnn b = cno.b();
                        if (obj == null) {
                            String str5 = cwh3.j;
                        }
                        if (b.a() == null) {
                            throw null;
                        }
                    }
                    if (cwh3 != null) {
                        i = cwh3.g;
                    }
                    a = cvx.a(i, cwh4);
                    cwh4.a(cwh4.c, a, cwh3, cwh4);
                    cwh4.g = a.d;
                    if (d) {
                        cno.c();
                    }
                    return a;
                }
                List list3;
                int i3;
                cvx a4 = cvx.a(cwh2);
                Map c = cwh.c(cwh);
                Map c2 = cwh.c(cwh2);
                if (cwh3 == null) {
                    list3 = c;
                } else {
                    list3 = new ArrayList(cwh3.h);
                }
                List list4 = cwh4.h;
                int i4 = -1;
                int i5 = -1;
                for (i3 = 0; i3 < list4.size(); i3++) {
                    String str6 = ((cwh) list4.get(i3)).i;
                    if (c.containsKey(str6)) {
                        zz zzVar = (zz) c.get(str6);
                        cwh cwh5 = (cwh) zzVar.a;
                        int intValue = ((Integer) zzVar.b).intValue();
                        if (i5 > intValue) {
                            for (int i6 = 0; i6 < cwh5.g; i6++) {
                                a4.a(cvy.a(0, cvz.a(list3, str6), i4, 1, null, null, null, null));
                            }
                            list3.remove(intValue);
                            list3.add(i5, cwh5);
                            i = list3.size();
                            for (int i7 = 0; i7 < i; i7++) {
                                cwh cwh6 = (cwh) list3.get(i7);
                                zz zzVar2 = (zz) c.get(cwh6.i);
                                if (((Integer) zzVar2.b).intValue() != i7) {
                                    c.put(cwh6.i, new zz((cwh) zzVar2.a, Integer.valueOf(i7)));
                                }
                            }
                        } else if (intValue > i5) {
                            i4 = (cvz.a(list3, str6) + ((cwh) list3.get(intValue)).g) - 1;
                            i5 = intValue;
                        }
                    }
                }
                SparseArray sparseArray = new SparseArray();
                i3 = 0;
                while (i3 < list3.size()) {
                    cwh cwh7 = (cwh) list3.get(i3);
                    if (c2.get(((cwh) list3.get(i3)).i) == null) {
                        sparseArray.put(i3, cvz.a(cwj, cwh7, null, list, cxd, str, a2, a3, str4));
                    }
                    i3++;
                    list2 = list;
                }
                i3 = 0;
                for (int i8 = 0; i8 < list4.size(); i8++) {
                    cwh cwh8 = (cwh) list4.get(i8);
                    zz zzVar3 = (zz) c.get(cwh8.i);
                    i4 = zzVar3 != null ? ((Integer) zzVar3.b).intValue() : -1;
                    cvx a5;
                    if (i4 < 0) {
                        cvx cvx = (cvx) sparseArray.get(i3);
                        a5 = cvz.a(cwj, null, cwh8, list, cxd, str, a2, a3, str4);
                        sparseArray.put(i3, cvx.a(cvx, a5));
                        if (cvx != null) {
                            cvx.b();
                        }
                        a5.b();
                    } else {
                        cvx cvx2 = (cvx) sparseArray.get(i4);
                        a5 = cvz.a(cwj, (cwh) list3.get(i4), cwh8, list, cxd, str, a2, a3, str4);
                        sparseArray.put(i4, cvx.a(cvx2, a5));
                        if (cvx2 != null) {
                            cvx2.b();
                        }
                        a5.b();
                        i3 = i4;
                    }
                }
                cwh.a();
                cwh.a();
                int size = sparseArray.size();
                cvx cvx3 = a4;
                for (i2 = 0; i2 < size; i2++) {
                    cvx cvx4 = (cvx) sparseArray.valueAt(i2);
                    cvx3 = cvx.a(cvx3, cvx4);
                    if (cvx4 != null) {
                        cvx4.b();
                    }
                }
                cwh4.g = cvx3.d;
                return cvx3;
            }
            cvx a6 = cvx.a(cwh3.g, cwh4);
            cwh4.g = a6.d;
            cxd.a(str, cwh, cwh2, a2, a3, Boolean.valueOf(false), str4);
            return a6;
        }
    }

    private static final int a(List list, String str) {
        int i = 0;
        for (cwh cwh : list) {
            if (cwh.i.equals(str)) {
                break;
            }
            i += cwh.g;
        }
        return i;
    }

    private static final String a(cwh cwh, String str) {
        if (cwh != null && cwh.a == null) {
            return cwh.getClass().getSimpleName();
        }
        if (cwh == null) {
            return "";
        }
        String simpleName = cwh.getClass().getSimpleName();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 2) + simpleName.length());
        stringBuilder.append(str);
        stringBuilder.append("->");
        stringBuilder.append(simpleName);
        return stringBuilder.toString();
    }
}
