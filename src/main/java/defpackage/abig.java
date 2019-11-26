package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: abig */
public final class abig {
    public static List a(akah akah, List list) {
        ArrayList arrayList = new ArrayList();
        if (akah != null) {
            apvs apvs = akah.c;
            if (apvs == null) {
                Object obj;
                akag akag = akah.b;
                if (akag == null) {
                    obj = akah.d;
                    if (obj == null) {
                        obj = akah.e;
                        if (obj == null) {
                            obj = akah.g;
                            if (obj == null) {
                                obj = akah.f;
                                if (obj == null) {
                                    obj = null;
                                }
                            }
                        }
                    }
                } else {
                    obj = akag;
                }
                if (obj != null) {
                    anvu anvu;
                    byte[] bArr;
                    if (akag != null) {
                        bArr = akag.c;
                        if (bArr == null) {
                            anvu = anvu.a;
                        } else {
                            anvu = anvu.a(bArr);
                        }
                    } else {
                        ajxl ajxl = akah.d;
                        if (ajxl != null) {
                            bArr = ajxl.d;
                            if (bArr == null) {
                                anvu = anvu.a;
                            } else {
                                anvu = anvu.a(bArr);
                            }
                        } else {
                            apvw apvw = akah.e;
                            if (apvw == null) {
                                apvu apvu = akah.g;
                                if (apvu == null) {
                                    apvy apvy = akah.f;
                                    if (apvy == null) {
                                        anvu = anvu.a;
                                    } else {
                                        anvu = apvy.d;
                                    }
                                } else {
                                    anvu = apvu.e;
                                }
                            } else {
                                anvu = apvw.e;
                            }
                        }
                    }
                    if (!(list == null || anvu.c())) {
                        list.add(anvu.d());
                    }
                    arrayList.add(obj);
                }
            } else {
                if (apvs.d) {
                    arrayList.add(new abij(apvs.e, apvs.f));
                }
                if (akah.c.c) {
                    arrayList.add(new abid());
                }
            }
        }
        return arrayList;
    }
}
