package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.protos.youtube.api.innertube.UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction;
import java.util.Map;

/* renamed from: eac */
public final class eac implements aaap {
    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.updateHorizontalCardListAction);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction = (UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction) b;
        String str = updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.b == 3 ? (String) updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.c : "";
        akxv akxv = (akxv) xsb.a(map, (Object) "sectionListController", akxv.class);
        if (akxv == null) {
            xtl.c("Cannot perform UpdateHorizontalCardListAction on a null section list controller.");
        } else if (str.isEmpty()) {
            xtl.c("Cannot perform UpdateHorizontalCardListAction without a section identifier.");
        } else {
            aysf aysf = updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.d;
            if (aysf == null) {
                aysf = aysf.c;
            }
            if (aysf.a == 50195462) {
                aysf aysf2 = updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.d;
                if (aysf2 == null) {
                    aysf2 = aysf.c;
                }
                ajwt ajwt = (ajwt) ajzv.a(aysf2.a == 50195462 ? (atvv) aysf2.b : atvv.d, ajwt.class);
                akwe akwe = (akwe) akxv.a(str);
                if (akwe == null) {
                    StringBuilder stringBuilder = new StringBuilder(str.length() + 103);
                    stringBuilder.append("Cannot perform UpdateHorizontalCardListAction. An ItemSectionController identified by \"");
                    stringBuilder.append(str);
                    stringBuilder.append("\" was not found.");
                    xtl.c(stringBuilder.toString());
                    return;
                }
                akwe.a(new aafj(ajwt));
                if (akwe.a().d() > 0 && (akxv instanceof akwy)) {
                    RecyclerView recyclerView = ((akwy) akxv).o;
                    if ((recyclerView.canScrollVertically(-1) ^ 1) != 0) {
                        apn apn = recyclerView.n;
                        if (apn instanceof ans) {
                            int q = ((ans) apn).q();
                            aknh j = akxv.j();
                            int i = 0;
                            Object c = akwe.a().c(0);
                            while (i <= q) {
                                if (j.c(i) == c) {
                                    akxv.a(str, null);
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
                return;
            }
            xtl.c("Cannot perform UpdateHorizontalCardListAction with a null replacement ItemSectionRenderer.");
        }
    }
}
