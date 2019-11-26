package defpackage;

import java.net.Socket;

/* renamed from: aivn */
final class aivn implements Runnable {
    private final Socket a;
    private final /* synthetic */ aivi b;

    aivn(aivi aivi, Socket socket) {
        this.b = aivi;
        this.a = socket;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0061 */
    public final void run() {
        /*
        r4 = this;
        r0 = new org.apache.http.impl.DefaultHttpServerConnection;
        r0.<init>();
        r1 = r4.a;	 Catch:{ ConnectionClosedException -> 0x0061, IOException -> 0x0037, HttpException -> 0x002d }
        r2 = r4.b;	 Catch:{ ConnectionClosedException -> 0x0061, IOException -> 0x0037, HttpException -> 0x002d }
        r2 = r2.a;	 Catch:{ ConnectionClosedException -> 0x0061, IOException -> 0x0037, HttpException -> 0x002d }
        r0.bind(r1, r2);	 Catch:{ ConnectionClosedException -> 0x0061, IOException -> 0x0037, HttpException -> 0x002d }
        r1 = new org.apache.http.protocol.BasicHttpContext;	 Catch:{ ConnectionClosedException -> 0x0061, IOException -> 0x0037, HttpException -> 0x002d }
        r1.<init>();	 Catch:{ ConnectionClosedException -> 0x0061, IOException -> 0x0037, HttpException -> 0x002d }
    L_0x0013:
        r2 = java.lang.Thread.interrupted();	 Catch:{ ConnectionClosedException -> 0x0061, IOException -> 0x0037, HttpException -> 0x002d }
        if (r2 != 0) goto L_0x0027;
    L_0x0019:
        r2 = r0.isOpen();	 Catch:{ ConnectionClosedException -> 0x0061, IOException -> 0x0037, HttpException -> 0x002d }
        if (r2 == 0) goto L_0x0027;
    L_0x001f:
        r2 = r4.b;	 Catch:{ ConnectionClosedException -> 0x0061, IOException -> 0x0037, HttpException -> 0x002d }
        r2 = r2.b;	 Catch:{ ConnectionClosedException -> 0x0061, IOException -> 0x0037, HttpException -> 0x002d }
        r2.handleRequest(r0, r1);	 Catch:{ ConnectionClosedException -> 0x0061, IOException -> 0x0037, HttpException -> 0x002d }
        goto L_0x0013;
    L_0x0027:
        r0.shutdown();	 Catch:{ IOException -> 0x002a }
    L_0x002a:
        return;
    L_0x002b:
        r1 = move-exception;
        goto L_0x005d;
    L_0x002d:
        r1 = move-exception;
        r2 = "HTTP protocol violation";
        defpackage.xtl.a(r2, r1);	 Catch:{ all -> 0x002b }
        r0.shutdown();	 Catch:{ IOException -> 0x0036 }
    L_0x0036:
        return;
    L_0x0037:
        r1 = move-exception;
        r2 = r1 instanceof java.net.SocketException;	 Catch:{ all -> 0x002b }
        if (r2 == 0) goto L_0x0054;
    L_0x003c:
        r2 = r1.getMessage();	 Catch:{ all -> 0x002b }
        r3 = "Connection reset by peer";
        r2 = r2.contains(r3);	 Catch:{ all -> 0x002b }
        if (r2 != 0) goto L_0x0059;
    L_0x0048:
        r2 = r1.getMessage();	 Catch:{ all -> 0x002b }
        r3 = "Socket closed";
        r2 = r2.contains(r3);	 Catch:{ all -> 0x002b }
        if (r2 != 0) goto L_0x0059;
    L_0x0054:
        r2 = "IOException when handling a request";
        defpackage.xtl.a(r2, r1);	 Catch:{ all -> 0x002b }
    L_0x0059:
        r0.shutdown();	 Catch:{ IOException -> 0x005c }
    L_0x005c:
        return;
    L_0x005d:
        r0.shutdown();	 Catch:{ IOException -> 0x0060 }
    L_0x0060:
        throw r1;
    L_0x0061:
        r0.shutdown();	 Catch:{ IOException -> 0x0064 }
    L_0x0064:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aivn.run():void");
    }
}
