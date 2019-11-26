package defpackage;

import com.google.protos.youtube.api.innertube.LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand;
import java.util.Map;

/* renamed from: wow */
public final class wow implements aaap {
    private final acum a;

    public wow(acum acum) {
        this.a = acum;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.logYpcFlowDismissCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand = (LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand) b;
        acum acum;
        anvu anvu;
        if (bchf.a((logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.a == 1 ? (anvu) logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.b : anvu.a).d())) {
            acum = this.a;
            wpp wpp = new wpp();
            if (logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.a == 1) {
                anvu = (anvu) logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.b;
            } else {
                anvu = anvu.a;
            }
            wpp.a(anvu.d());
            acum.a(wpp.b());
        } else {
            asmz asmz;
            asmw asmw;
            if (bchf.a((logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.a == 2 ? (anvu) logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.b : anvu.a).d())) {
                acum = this.a;
                wqm wqm = new wqm();
                if (logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.a == 2) {
                    anvu = (anvu) logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.b;
                } else {
                    anvu = anvu.a;
                }
                wqm.a = anvu;
                asmz = (asmz) asmw.f.createBuilder();
                azls a = wqm.a();
                asmz.copyOnWrite();
                asmw = (asmw) asmz.instance;
                if (a != null) {
                    asmw.c = a;
                    asmw.b = 199;
                    acum.a((asmw) ((anxl) asmz.build()));
                    return;
                }
                throw new NullPointerException();
            }
            if (bchf.a((logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.a == 3 ? (anvu) logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.b : anvu.a).d())) {
                acum = this.a;
                wqu wqu = new wqu();
                wqu.a((logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.a == 3 ? (anvu) logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.b : anvu.a).d());
                asmz = (asmz) asmw.f.createBuilder();
                azly a2 = wqu.a();
                asmz.copyOnWrite();
                asmw = (asmw) asmz.instance;
                if (a2 != null) {
                    asmw.c = a2;
                    asmw.b = 189;
                    acum.a((asmw) ((anxl) asmz.build()));
                    return;
                }
                throw new NullPointerException();
            }
            if (bchf.a((logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.a == 4 ? (anvu) logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.b : anvu.a).d())) {
                acum = this.a;
                wrb wrb = new wrb();
                wrb.a((logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.a == 4 ? (anvu) logYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.b : anvu.a).d());
                asmz = (asmz) asmw.f.createBuilder();
                azmc a3 = wrb.a();
                asmz.copyOnWrite();
                asmw = (asmw) asmz.instance;
                if (a3 != null) {
                    asmw.c = a3;
                    asmw.b = 194;
                    acum.a((asmw) ((anxl) asmz.build()));
                    return;
                }
                throw new NullPointerException();
            }
        }
    }
}
