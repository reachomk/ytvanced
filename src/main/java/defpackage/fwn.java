package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.protos.youtube.api.innertube.RelatedChipEndpoint$RelatedChipCommand;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: fwn */
public final class fwn implements aaap {
    public final xoi a;
    public final acvx b;

    public fwn(xoi xoi, acvx acvx) {
        this.a = xoi;
        this.b = acvx;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(RelatedChipEndpoint$RelatedChipCommand.relatedChipCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        RelatedChipEndpoint$RelatedChipCommand relatedChipEndpoint$RelatedChipCommand = (RelatedChipEndpoint$RelatedChipCommand) b;
        if (relatedChipEndpoint$RelatedChipCommand != null) {
            lsv lsv = (lsv) map.get("sectionController");
            if (lsv != null) {
                aktq aktq = (aktq) map.get("sectionListController");
                if (aktq != null) {
                    View i = aktq.i();
                    akoh akoh = aktq.d;
                    if ((i instanceof RecyclerView) && (akoh instanceof akoh)) {
                        View view = (RecyclerView) i;
                        fwn.a(aktq.e, view);
                        if (relatedChipEndpoint$RelatedChipCommand.a == 3 && ((Boolean) relatedChipEndpoint$RelatedChipCommand.b).booleanValue()) {
                            lsv.g();
                        } else {
                            if (lsv.a == null) {
                                lsv.a = new ArrayList(lsv.l);
                            }
                            akpk akpk = lsv.g;
                            int size = akpk.size();
                            while (true) {
                                size--;
                                if (size < 0) {
                                    break;
                                }
                                Object obj = akpk.get(size);
                                if (!(obj instanceof arss)) {
                                    if (!(obj instanceof ejb)) {
                                        akpk.remove(size);
                                    }
                                }
                            }
                            for (size = 0; size < akpk.size(); size++) {
                                if (!(akpk.get(size) instanceof ejb)) {
                                    akpk.a(size, new ejb(size));
                                }
                            }
                            lsv.b++;
                        }
                        view.c(Math.max(0, akoh.e(lsv.e)));
                        if (relatedChipEndpoint$RelatedChipCommand.a != 3 || !((Boolean) relatedChipEndpoint$RelatedChipCommand.b).booleanValue()) {
                            if (relatedChipEndpoint$RelatedChipCommand.a == 1) {
                                aqll aqll = (aqll) relatedChipEndpoint$RelatedChipCommand.b;
                                anxr access$0002 = anxl.checkIsLite(awzv.e);
                                aqll.a(access$0002);
                                b = aqll.h.b(access$0002.d);
                                if (b == null) {
                                    b = access$0002.b;
                                } else {
                                    b = access$0002.a(b);
                                }
                                b = (awzv) b;
                            } else {
                                b = null;
                            }
                            if (b != null) {
                                aktq.M = new fwq(this, lsv.b, lsv, aktq, view, map);
                                aktq.L = new fwp(this);
                                aktq.a(ajtj.a(b));
                            }
                        }
                    }
                }
            }
        }
    }

    public static void a(akos akos, View view) {
        akov fws = new fws(view.getResources().getInteger(17694720));
        akos.a(fws);
        view.post(new fwr(akos, fws));
    }
}
