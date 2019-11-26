package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bge */
public final class bge extends pc {
    public final boolean a(Object obj) {
        return obj instanceof bgx;
    }

    public final Object b(Object obj) {
        return obj != null ? (bgx) ((bgx) obj).clone() : null;
    }

    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        bhj bhj = new bhj();
        bhj.a((bgx) obj);
        return bhj;
    }

    public final void a(Object obj, View view, ArrayList arrayList) {
        obj = (bhj) obj;
        ArrayList arrayList2 = obj.f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            pc.a((List) arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        a(obj, arrayList);
    }

    public final void a(Object obj, View view) {
        if (view != null) {
            bgx bgx = (bgx) obj;
            pc.a(view, new Rect());
            bgx.a(new bgh());
        }
    }

    public final void a(Object obj, ArrayList arrayList) {
        bgx bgx = (bgx) obj;
        if (bgx != null) {
            int i = 0;
            int h;
            if (bgx instanceof bhj) {
                bhj bhj = (bhj) bgx;
                h = bhj.h();
                while (i < h) {
                    a(bhj.c(i), arrayList);
                    i++;
                }
            } else if (!bge.a(bgx) && pc.a((List) bgx.f)) {
                h = arrayList.size();
                while (i < h) {
                    bgx.c((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    private static boolean a(bgx bgx) {
        return (pc.a((List) bgx.e) && pc.a((List) bgx.g) && pc.a((List) bgx.h)) ? false : true;
    }

    public final Object a(Object obj, Object obj2, Object obj3) {
        bhj bhj = new bhj();
        if (obj != null) {
            bhj.a((bgx) obj);
        }
        if (obj2 != null) {
            bhj.a((bgx) obj2);
        }
        if (obj3 != null) {
            bhj.a((bgx) obj3);
        }
        return bhj;
    }

    public final void b(Object obj, View view, ArrayList arrayList) {
        ((bgx) obj).a(new bgg(view, arrayList));
    }

    public final void a(ViewGroup viewGroup, Object obj) {
        bhf.a(viewGroup, (bgx) obj);
    }

    public final void a(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((bgx) obj).a(new bgj(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public final void a(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        obj = (bhj) obj;
        if (obj != null) {
            obj.f.clear();
            obj.f.addAll(arrayList2);
            b(obj, arrayList, arrayList2);
        }
    }

    public final void b(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        bgx bgx = (bgx) obj;
        int i = 0;
        int h;
        if (bgx instanceof bhj) {
            bhj bhj = (bhj) bgx;
            h = bhj.h();
            while (i < h) {
                b(bhj.c(i), arrayList, arrayList2);
                i++;
            }
        } else if (!bge.a(bgx)) {
            ArrayList arrayList3 = bgx.f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                h = arrayList2 != null ? arrayList2.size() : 0;
                while (i < h) {
                    bgx.c((View) arrayList2.get(i));
                    i++;
                }
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        bgx.d((View) arrayList.get(size));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void b(Object obj, View view) {
        if (obj != null) {
            ((bgx) obj).c(view);
        }
    }

    public final void c(Object obj, View view) {
        ((bgx) obj).d(view);
    }

    public final void a(Object obj, Rect rect) {
        if (obj != null) {
            ((bgx) obj).a(new bgi());
        }
    }
}
