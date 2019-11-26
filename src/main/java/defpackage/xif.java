package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: xif */
public class xif extends bckr {
    private final xgv a;

    public xif(xgv xgv, Executor executor) {
        super(executor);
        this.a = xgv;
    }

    public void a(bcko bcko) {
        this.a.a(xif.b(bcko));
    }

    public static xgt b(bcko bcko) {
        xfm xfm = new xfm();
        String a = bcko.a();
        if (a != null) {
            xfm.a = a;
            bclb e = bcko.e();
            if (e != null) {
                xfm.g = Integer.valueOf(e.b());
                xfm.h = e.f();
                Map e2 = e.e();
                if (e2 != null) {
                    List list = (List) e2.get("Content-Type");
                    if (!(list == null || list.isEmpty())) {
                        xfm.b = (String) list.get(0);
                    }
                }
            }
            bckq c = bcko.c();
            if (c != null) {
                xfm.c = c.g();
                xfm.d = c.f();
                xfm.e = c.d();
                xfm.f = c.e();
            }
            int d = bcko.d();
            int i = 4;
            d = d != 0 ? d != 1 ? d != 2 ? 1 : 4 : 3 : 2;
            xfm.i = Integer.valueOf(d - 1);
            if (bcko.f() != null) {
                bcjd f = bcko.f();
                if (f instanceof bcja) {
                    i = 2;
                } else {
                    if (f instanceof bckg) {
                        switch (((bckg) f).a()) {
                            case 1:
                                i = 3;
                                break;
                            case 2:
                                break;
                            case 3:
                                i = 5;
                                break;
                            case 4:
                                i = 6;
                                break;
                            case 5:
                                i = 7;
                                break;
                            case 6:
                                i = 8;
                                break;
                            case 7:
                                i = 9;
                                break;
                            case 8:
                                i = 10;
                                break;
                            case 9:
                                i = 11;
                                break;
                            case 10:
                                i = 12;
                                break;
                            case 11:
                                i = 13;
                                break;
                        }
                    }
                    i = 1;
                }
                xfm.j = Integer.valueOf(i - 1);
                if (bcko.f() instanceof bckn) {
                    xfm.k = Integer.valueOf(((bckn) bcko.f()).d());
                }
            }
            if (bcko.b() != null) {
                Collection b = bcko.b();
                ArrayList arrayList = new ArrayList();
                for (Object next : b) {
                    if (next instanceof xii) {
                        Collection collection = ((xii) next).a;
                        if (collection != null) {
                            arrayList.addAll(collection);
                        }
                    } else {
                        arrayList.add(next);
                    }
                }
                xfm.l = arrayList;
            }
            String str = "";
            if (xfm.a == null) {
                str = str.concat(" url");
            }
            if (xfm.i == null) {
                str = String.valueOf(str).concat(" requestStatus");
            }
            if (str.isEmpty()) {
                return new xfj(xfm.a, xfm.b, xfm.c, xfm.d, xfm.e, xfm.f, xfm.g, xfm.h, xfm.i.intValue(), xfm.j, xfm.k, xfm.l);
            }
            a = "Missing required properties:";
            throw new IllegalStateException(str.length() == 0 ? new String(a) : a.concat(str));
        }
        throw new NullPointerException("Null url");
    }
}
