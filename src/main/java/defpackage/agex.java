package defpackage;

import android.database.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: agex */
public final class agex {
    public final agpi a;
    private final agew b;
    private final agio c;
    private final agfu d;
    private final aghw e;
    private final aghr f;
    private final aghn g;
    private final ages h;
    private final List i = new ArrayList();

    public agex(agpi agpi, agew agew, agio agio, agfu agfu, aghw aghw, aghr aghr, aghn aghn, ages ages) {
        this.a = agpi;
        this.b = agew;
        this.c = agio;
        this.d = agfu;
        this.e = aghw;
        this.f = aghr;
        this.g = aghn;
        this.h = ages;
        agew.b.add(new agez(this));
        agio.a(new agfe(this));
        agfu.a(new agfc(this));
        aghw.a(new agfb(this));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: Unknown predecessor block by arg (r7_1 ?) in PHI: PHI: (r7_2 ?) = (r7_1 ?), (r7_0 java.lang.String) binds: {(r7_0 java.lang.String)=B:20:0x0099}
        	at jadx.core.dex.instructions.PhiInsn.replaceArg(PhiInsn.java:78)
        	at jadx.core.dex.visitors.ssa.SSATransform.inlinePhiInsn(SSATransform.java:392)
        	at jadx.core.dex.visitors.ssa.SSATransform.replacePhiWithMove(SSATransform.java:360)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiWithSameArgs(SSATransform.java:300)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixUselessPhi(SSATransform.java:275)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:61)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1507)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void a(java.lang.String r7) {
        /*
        r6 = this;
        defpackage.amqw.a((java.lang.Object) r7);
        r0 = r6.c;
        r0 = r0.a;
        r0 = r0.a();
        r1 = 1;
        r2 = new java.lang.String[r1];
        r3 = 0;
        r2[r3] = r7;
        r4 = "SELECT COUNT(*) FROM videosV2 WHERE channel_id=?";
        r0 = r0.rawQuery(r4, r2);
        r0.moveToFirst();	 Catch:{ all -> 0x009d }
        r2 = r0.getInt(r3);	 Catch:{ all -> 0x009d }
        r0.close();
        if (r2 == 0) goto L_0x0024;
        goto L_0x0097;
        r0 = r6.d;
        r0 = r0.a;
        r0 = r0.a();
        r2 = new java.lang.String[r1];
        r2[r3] = r7;
        r4 = "SELECT COUNT(*) FROM playlistsV13 WHERE channel_id=?";
        r0 = r0.rawQuery(r4, r2);
        r0.moveToFirst();	 Catch:{ all -> 0x0098 }
        r2 = r0.getInt(r3);	 Catch:{ all -> 0x0098 }
        r0.close();
        if (r2 != 0) goto L_?;
        r0 = r6.b;	 Catch:{ SQLException -> 0x0091 }
        r2 = r0.a;	 Catch:{ SQLException -> 0x0091 }
        r2 = r2.a();	 Catch:{ SQLException -> 0x0091 }
        r4 = "channelsV13";	 Catch:{ SQLException -> 0x0091 }
        r5 = "id = ?";	 Catch:{ SQLException -> 0x0091 }
        r1 = new java.lang.String[r1];	 Catch:{ SQLException -> 0x0091 }
        r1[r3] = r7;	 Catch:{ SQLException -> 0x0091 }
        r1 = r2.delete(r4, r5, r1);	 Catch:{ SQLException -> 0x0091 }
        r1 = (long) r1;	 Catch:{ SQLException -> 0x0091 }
        r3 = 1;	 Catch:{ SQLException -> 0x0091 }
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));	 Catch:{ SQLException -> 0x0091 }
        if (r5 != 0) goto L_0x0073;	 Catch:{ SQLException -> 0x0091 }
        r0 = r0.b;	 Catch:{ SQLException -> 0x0091 }
        r0 = r0.iterator();	 Catch:{ SQLException -> 0x0091 }
        r1 = r0.hasNext();	 Catch:{ SQLException -> 0x0091 }
        if (r1 == 0) goto L_0x0097;	 Catch:{ SQLException -> 0x0091 }
        r1 = r0.next();	 Catch:{ SQLException -> 0x0091 }
        r1 = (defpackage.agey) r1;	 Catch:{ SQLException -> 0x0091 }
        r1.a(r7);	 Catch:{ SQLException -> 0x0091 }
        goto L_0x0063;	 Catch:{ SQLException -> 0x0091 }
        r7 = new android.database.SQLException;	 Catch:{ SQLException -> 0x0091 }
        r0 = new java.lang.StringBuilder;	 Catch:{ SQLException -> 0x0091 }
        r3 = 49;	 Catch:{ SQLException -> 0x0091 }
        r0.<init>(r3);	 Catch:{ SQLException -> 0x0091 }
        r3 = "Delete channel affected ";	 Catch:{ SQLException -> 0x0091 }
        r0.append(r3);	 Catch:{ SQLException -> 0x0091 }
        r0.append(r1);	 Catch:{ SQLException -> 0x0091 }
        r1 = " rows";	 Catch:{ SQLException -> 0x0091 }
        r0.append(r1);	 Catch:{ SQLException -> 0x0091 }
        r0 = r0.toString();	 Catch:{ SQLException -> 0x0091 }
        r7.<init>(r0);	 Catch:{ SQLException -> 0x0091 }
        throw r7;	 Catch:{ SQLException -> 0x0091 }
        r7 = move-exception;
        r0 = "Error deleting channel";
        defpackage.xtl.a(r0, r7);
        return;
        r7 = move-exception;
        r0.close();
        throw r7;
        r7 = move-exception;
        r0.close();
        goto L_0x00a3;
        throw r7;
        goto L_0x00a2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agex.a(java.lang.String):void");
    }

    public final void a(agfa agfa) {
        this.i.add(agfa);
    }

    public final void a(Collection collection) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (agqp agqp : collection) {
            String a = agqp.a();
            if (!hashSet.contains(a)) {
                hashSet.add(a);
                amqw.a((Object) agqp);
                String a2 = agqp.a();
                if (!(this.d.b(a2) || this.d.a(a2))) {
                    if (xbs.a(this.e.a.a(), "video_list_videos", "video_list_id IS NOT NULL AND video_id = ?", new String[]{a2}) <= 0) {
                        a(agqp);
                        xvd.a(a2);
                        if (this.h.a(a2) <= 0) {
                            this.g.a(a2, false);
                        }
                        arrayList.add(a);
                    }
                }
            }
        }
        if (arrayList.size() > 0) {
            for (agfa a3 : this.i) {
                a3.a(arrayList);
            }
        }
    }

    private final void a(agqp agqp) {
        if (!agqp.c) {
            try {
                this.f.a(agqp.a());
                this.c.b(agqp);
            } catch (SQLException e) {
                xtl.a("Error cleaning up video", e);
            }
        }
    }
}
