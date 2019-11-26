package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;

/* renamed from: azzs */
final class azzs extends bckz {
    public final anjy a = anjy.a(this.e);
    public azzh b;
    public azzk c;
    private final ExecutorService d;
    private final azzv e = new azzv();
    private final azzq f;

    azzs(ExecutorService executorService) {
        Object azzq = new azzq();
        this.d = (ExecutorService) amqw.a((Object) executorService);
        this.f = (azzq) amqw.a(azzq);
    }

    public final void a(bckx bckx, bclb bclb, String str) {
        bckx.c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Missing block: B:15:0x0057, code skipped:
            if ("identity".equals(((java.util.List) r11.get(r0)).get(0)) != false) goto L_0x005d;
     */
    public final void a(defpackage.bckx r10, defpackage.bclb r11) {
        /*
        r9 = this;
        r0 = r9.f;
        r0 = r0.b;
        r1 = 1;
        r0 = r0 ^ r1;
        defpackage.amqw.b(r0);
        r11 = r11.e();
        r0 = "content-length";
        r2 = r11.containsKey(r0);
        r3 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        if (r2 != 0) goto L_0x001a;
    L_0x0018:
        r0 = r3;
        goto L_0x0060;
    L_0x001a:
        r2 = 0;
        r5 = 0;
        r0 = r11.get(r0);	 Catch:{ NumberFormatException -> 0x002e }
        r0 = (java.util.List) r0;	 Catch:{ NumberFormatException -> 0x002e }
        r0 = r0.get(r2);	 Catch:{ NumberFormatException -> 0x002e }
        r0 = (java.lang.String) r0;	 Catch:{ NumberFormatException -> 0x002e }
        r7 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x002e }
        goto L_0x002f;
    L_0x002e:
        r7 = r5;
    L_0x002f:
        r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
        if (r0 <= 0) goto L_0x0018;
    L_0x0033:
        r0 = "content-encoding";
        r5 = r11.containsKey(r0);
        if (r5 == 0) goto L_0x005d;
    L_0x003b:
        r5 = r11.get(r0);
        r5 = (java.util.List) r5;
        r5 = r5.size();
        if (r5 != r1) goto L_0x005a;
    L_0x0047:
        r11 = r11.get(r0);
        r11 = (java.util.List) r11;
        r11 = r11.get(r2);
        r0 = "identity";
        r11 = r0.equals(r11);
        if (r11 == 0) goto L_0x005a;
    L_0x0059:
        goto L_0x005d;
    L_0x005a:
        r0 = r7 + r7;
        goto L_0x0060;
    L_0x005d:
        r0 = 1;
        r0 = r0 + r7;
    L_0x0060:
        r0 = java.lang.Math.min(r0, r3);
        r11 = (int) r0;
        r11 = java.nio.ByteBuffer.allocateDirect(r11);
        r10.a(r11);
        r10 = r9.c;
        if (r10 == 0) goto L_0x0073;
    L_0x0070:
        r10.a();
    L_0x0073:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azzs.a(bckx, bclb):void");
    }

    public final void a(bckx bckx, bclb bclb, ByteBuffer byteBuffer) {
        azzq azzq = this.f;
        amqw.b(azzq.b ^ 1);
        if (byteBuffer != azzq.a.peekLast()) {
            azzq.a.addLast(byteBuffer);
        }
        if (!byteBuffer.hasRemaining()) {
            byteBuffer = ByteBuffer.allocateDirect(8192);
        }
        bckx.a(byteBuffer);
    }

    public final void b(bckx bckx, bclb bclb) {
        ByteBuffer allocateDirect;
        azyn azyn = new azyn();
        for (Entry entry : bclb.d()) {
            azyn.b((String) entry.getKey(), (String) entry.getValue());
        }
        int b = bclb.b();
        azzq azzq = this.f;
        amqw.b(azzq.b ^ 1);
        azzq.b = true;
        Iterator it = azzq.a.iterator();
        while (it.hasNext()) {
            ((ByteBuffer) it.next()).flip();
        }
        if (azzq.a.isEmpty()) {
            allocateDirect = ByteBuffer.allocateDirect(0);
        } else if (azzq.a.size() == 1) {
            allocateDirect = (ByteBuffer) azzq.a.remove();
        } else {
            it = azzq.a.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += ((ByteBuffer) it.next()).remaining();
            }
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i);
            while (!azzq.a.isEmpty()) {
                allocateDirect2.put((ByteBuffer) azzq.a.remove());
            }
            allocateDirect2.flip();
            allocateDirect = allocateDirect2;
        }
        allocateDirect.position(0);
        azyp azyp = new azyp(b, azyn, new uht(allocateDirect));
        azzk azzk = this.c;
        if (azzk != null) {
            azzk.b(this.b);
        }
        this.e.a = new azzl(azyp);
        this.d.execute(this.a);
    }

    public final void a(bckx bckx, bclb bclb, bcjd bcjd) {
        azzi azzi = azzi.UNKNOWN;
        if (bcjd instanceof bckg) {
            switch (((bckg) bcjd).a()) {
                case 1:
                    azzi = azzi.BAD_URL;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    azzi = azzi.CONNECTION_ERROR;
                    break;
            }
        }
        azzj azzj = new azzj(azzi, (Throwable) bcjd);
        azzk azzk = this.c;
        if (azzk != null) {
            azzk.c(this.b);
        }
        this.e.a = new azzl(azzj);
        this.d.execute(this.a);
    }

    public final void c(bckx bckx, bclb bclb) {
        azzj azzj = new azzj(azzi.CANCELED, "");
        azzk azzk = this.c;
        if (azzk != null) {
            azzk.c(this.b);
        }
        this.e.a = new azzl(azzj);
        this.d.execute(this.a);
    }
}
