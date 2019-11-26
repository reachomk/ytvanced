package defpackage;

/* renamed from: agyu */
final class agyu extends Thread {
    private final /* synthetic */ agyr a;

    agyu(agyr agyr, Runnable runnable, String str) {
        this.a = agyr;
        super(runnable, str);
    }

    public final void run() {
        String str = " ms";
        String str2 = "Transfer wakelock held for ";
        xtl.e("Acquiring transfer wakelock");
        long currentTimeMillis = System.currentTimeMillis();
        this.a.a.acquire();
        try {
            super.run();
        } finally {
            this.a.a.release();
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append(str2);
            stringBuilder.append(currentTimeMillis2 - currentTimeMillis);
            stringBuilder.append(str);
            xtl.d(stringBuilder.toString());
        }
    }
}
