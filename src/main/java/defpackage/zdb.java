package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: zdb */
public final class zdb {
    public static boolean a(aqnf aqnf) {
        if (aqnf == null) {
            return false;
        }
        aphj aphj = aqnf.e;
        if (aphj == null) {
            aphj = aphj.d;
        }
        aphv aphv = aphj.c;
        if (aphv == null) {
            aphv = aphv.s;
        }
        return aphv.b;
    }

    public static String a(Object obj) {
        if (obj instanceof aqoj) {
            return ((aqoj) obj).d;
        }
        if (obj instanceof ajtu) {
            return ((ajtu) obj).k;
        }
        if (obj instanceof aqnt) {
            return ((aqnt) obj).c;
        }
        if (obj instanceof aqnr) {
            aqnr aqnr = (aqnr) obj;
            if ((aqnr.a & 4) != 0) {
                return aqnr.d;
            }
            return null;
        } else if (obj instanceof aqnx) {
            aqnx aqnx = (aqnx) obj;
            if ((aqnx.a & 4) != 0) {
                return aqnx.d;
            }
            return null;
        } else {
            if (obj instanceof aqmx) {
                aqmx aqmx = (aqmx) obj;
                if ((aqmx.a & 4) != 0) {
                    return aqmx.d;
                }
            }
            return null;
        }
    }

    public static List a(ajts ajts) {
        ArrayList arrayList = new ArrayList();
        aqoh[] aqohArr = ajts.f;
        if (aqohArr != null) {
            for (aqoh aqoh : aqohArr) {
                int i = aqoh.a;
                Object obj;
                if ((i & 4) != 0) {
                    obj = aqoh.d;
                    if (obj == null) {
                        obj = ayhc.e;
                    }
                    arrayList.add(ajtj.a(obj));
                } else if ((i & 2) != 0) {
                    obj = aqoh.c;
                    if (obj == null) {
                        obj = avkc.f;
                    }
                    arrayList.add(ajtj.a(obj));
                } else if ((i & 1) != 0) {
                    obj = aqoh.b;
                    if (obj == null) {
                        obj = atuj.f;
                    }
                    arrayList.add(ajtj.a(obj));
                }
            }
        }
        return arrayList;
    }

    public static List a(ajts ajts, Set set) {
        ArrayList arrayList = new ArrayList();
        ajtp[] ajtpArr = ajts.c;
        if (ajtpArr != null) {
            for (ajtp a : ajtpArr) {
                Object a2 = zdb.a(a);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        if (set != null) {
            hashSet.addAll(set);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            String a3 = zdb.a(obj);
            if (!TextUtils.isEmpty(a3)) {
                if (hashSet.contains(a3)) {
                } else {
                    hashSet.add(a3);
                }
            }
            arrayList2.add(obj);
        }
        return arrayList2;
    }

    public static Object a(ajtp ajtp) {
        if (ajtp == null) {
            return null;
        }
        Object obj = ajtp.c;
        if (obj == null) {
            obj = ajtp.d;
            if (obj == null) {
                obj = ajtp.b;
                if (obj == null) {
                    obj = ajtp.e;
                    if (obj == null) {
                        obj = ajtp.f;
                        if (obj == null) {
                            obj = ajtp.h;
                            if (obj == null) {
                                aqnx aqnx = ajtp.g;
                                if (aqnx == null) {
                                    return null;
                                }
                                return aqnx;
                            }
                        }
                    }
                }
            }
        }
        return obj;
    }
}
