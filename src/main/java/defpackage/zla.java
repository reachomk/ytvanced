package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: zla */
public final class zla {
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
    public final ArrayList b = new ArrayList();

    public final void a(bacz bacz) {
        babp babp = (babp) babm.c.createBuilder();
        babp.copyOnWrite();
        babm babm = (babm) babp.instance;
        if (bacz != null) {
            babm.b = bacz;
            babm.a = 2;
            babp.toString();
            this.a.add((babm) ((anxl) babp.build()));
            return;
        }
        throw new NullPointerException();
    }

    public final void a(String str) {
        baap baap = (baap) baam.c.createBuilder();
        baap.copyOnWrite();
        baam baam = (baam) baap.instance;
        if (str != null) {
            baam.a |= 1;
            baam.b = str;
            baam baam2 = (baam) ((anxl) baap.build());
            babp babp = (babp) babm.c.createBuilder();
            babp.copyOnWrite();
            babm babm = (babm) babp.instance;
            if (baam2 != null) {
                babm.b = baam2;
                babm.a = 6;
                this.a.add((babm) ((anxl) babp.build()));
                return;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
