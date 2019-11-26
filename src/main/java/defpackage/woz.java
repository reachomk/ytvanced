package defpackage;

import com.google.protos.youtube.api.innertube.LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand;
import java.util.Map;

/* renamed from: woz */
public final class woz implements aaap {
    private final acum a;

    public woz(acum acum) {
        this.a = acum;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.logYpcFlowStartCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand = (LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand) b;
        acum acum;
        anvu anvu;
        if ((logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.a == 1 ? (anvu) logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.b : anvu.a).c()) {
            asmz asmz;
            asmw asmw;
            if ((logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.a == 2 ? (anvu) logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.b : anvu.a).c()) {
                if ((logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.a == 3 ? (anvu) logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.b : anvu.a).c()) {
                    if (!(logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.a == 4 ? (anvu) logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.b : anvu.a).c()) {
                        acum = this.a;
                        wrb wrb = new wrb();
                        wrb.a((logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.a == 4 ? (anvu) logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.b : anvu.a).d());
                        asmz = (asmz) asmw.f.createBuilder();
                        azmc a = wrb.a();
                        asmz.copyOnWrite();
                        asmw = (asmw) asmz.instance;
                        if (a != null) {
                            asmw.c = a;
                            asmw.b = 193;
                            acum.a((asmw) ((anxl) asmz.build()));
                            return;
                        }
                        throw new NullPointerException();
                    }
                }
                acum = this.a;
                wqu wqu = new wqu();
                wqu.a((logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.a == 3 ? (anvu) logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.b : anvu.a).d());
                asmz = (asmz) asmw.f.createBuilder();
                azly a2 = wqu.a();
                asmz.copyOnWrite();
                asmw = (asmw) asmz.instance;
                if (a2 != null) {
                    asmw.c = a2;
                    asmw.b = 188;
                    acum.a((asmw) ((anxl) asmz.build()));
                    return;
                }
                throw new NullPointerException();
            }
            acum = this.a;
            wqm wqm = new wqm();
            if (logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.a == 2) {
                anvu = (anvu) logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.b;
            } else {
                anvu = anvu.a;
            }
            wqm.a = anvu;
            asmz = (asmz) asmw.f.createBuilder();
            azls a3 = wqm.a();
            asmz.copyOnWrite();
            asmw = (asmw) asmz.instance;
            if (a3 != null) {
                asmw.c = a3;
                asmw.b = 198;
                acum.a((asmw) ((anxl) asmz.build()));
                return;
            }
            throw new NullPointerException();
        }
        acum = this.a;
        wpp wpp = new wpp();
        if (logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.a == 1) {
            anvu = (anvu) logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.b;
        } else {
            anvu = anvu.a;
        }
        wpp.a(anvu.d());
        acum.a(wpp.a());
    }
}
