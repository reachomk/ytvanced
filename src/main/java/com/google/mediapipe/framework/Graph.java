package com.google.mediapipe.framework;

import defpackage.amqw;
import defpackage.amxr;
import defpackage.amxs;
import defpackage.anuv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Graph {
    private static final amxs a = amxs.a("com/google/mediapipe/framework/Graph");
    private long b = nativeCreateGraph();
    private final List c = new ArrayList();
    private final List d = new ArrayList();
    private Map e = new HashMap();
    private Map f = new HashMap();
    private boolean g = false;
    private boolean h = false;
    private Map i = new HashMap();
    private final Object j = new Object();

    private native void nativeAddPacketCallback(long j, String str, PacketCallback packetCallback);

    private native void nativeAddPacketToInputStream(long j, String str, long j2, long j3);

    private native void nativeAddPacketWithHeaderCallback(long j, String str, PacketWithHeaderCallback packetWithHeaderCallback);

    private native long nativeAddSurfaceOutput(long j, String str);

    private native void nativeCancelGraph(long j);

    private native void nativeCloseAllInputStreams(long j);

    private native void nativeCloseAllPacketSources(long j);

    private native void nativeCloseInputStream(long j, String str);

    private native long nativeCreateGraph();

    private native byte[] nativeGetCalculatorGraphConfig(long j);

    private native long nativeGetProfiler(long j);

    private native void nativeLoadBinaryGraph(long j, String str);

    private native void nativeLoadBinaryGraphBytes(long j, byte[] bArr);

    private native void nativeMovePacketToInputStream(long j, String str, long j2, long j3);

    private native void nativeReleaseGraph(long j);

    private native void nativeRunGraphUntilClose(long j, String[] strArr, long[] jArr);

    private native void nativeSetGraphInputStreamBlockingMode(long j, boolean z);

    private native void nativeSetParentGlContext(long j, long j2);

    private native void nativeStartRunningGraph(long j, String[] strArr, long[] jArr, String[] strArr2, long[] jArr2);

    private native void nativeUpdatePacketReference(long j, long j2);

    private native void nativeWaitUntilGraphDone(long j);

    private native void nativeWaitUntilGraphIdle(long j);

    public final synchronized long a() {
        return this.b;
    }

    public final synchronized void a(byte[] bArr) {
        amqw.b(this.b != 0, (Object) "Invalid context, tearDown() might have been called already.");
        nativeLoadBinaryGraphBytes(this.b, bArr);
    }

    public final synchronized void a(String str, PacketCallback packetCallback) {
        boolean z = false;
        amqw.b(this.b != 0, (Object) "Invalid context, tearDown() might have been called already.");
        amqw.a((Object) str);
        amqw.a((Object) packetCallback);
        if (!this.h) {
            if (!this.g) {
                z = true;
            }
        }
        amqw.b(z);
        this.c.add(packetCallback);
        nativeAddPacketCallback(this.b, str, packetCallback);
    }

    public final synchronized void a(Map map) {
        boolean z = false;
        amqw.b(this.b != 0, (Object) "Invalid context, tearDown() might have been called.");
        if (!this.h) {
            if (!this.g) {
                z = true;
            }
        }
        amqw.b(z);
        for (Entry entry : map.entrySet()) {
            this.e.put((String) entry.getKey(), ((Packet) entry.getValue()).b());
        }
    }

    /* JADX WARNING: Missing block: B:32:0x00fb, code skipped:
            return;
     */
    public final synchronized void b() {
        /*
        r15 = this;
        monitor-enter(r15);
        r0 = r15.b;	 Catch:{ all -> 0x00fc }
        r2 = 0;
        r4 = 0;
        r5 = 1;
        r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r6 == 0) goto L_0x000d;
    L_0x000b:
        r0 = 1;
        goto L_0x000e;
    L_0x000d:
        r0 = 0;
    L_0x000e:
        r1 = "Invalid context, tearDown() might have been called.";
        defpackage.amqw.b(r0, r1);	 Catch:{ all -> 0x00fc }
        r15.g = r5;	 Catch:{ all -> 0x00fc }
        r0 = r15.f;	 Catch:{ all -> 0x00fc }
        r0 = r0.entrySet();	 Catch:{ all -> 0x00fc }
        r0 = r0.iterator();	 Catch:{ all -> 0x00fc }
    L_0x001f:
        r1 = r0.hasNext();	 Catch:{ all -> 0x00fc }
        if (r1 == 0) goto L_0x004e;
    L_0x0025:
        r1 = r0.next();	 Catch:{ all -> 0x00fc }
        r1 = (java.util.Map.Entry) r1;	 Catch:{ all -> 0x00fc }
        r1 = r1.getValue();	 Catch:{ all -> 0x00fc }
        if (r1 != 0) goto L_0x001f;
    L_0x0031:
        r0 = a;	 Catch:{ all -> 0x00fc }
        r0 = r0.c();	 Catch:{ all -> 0x00fc }
        r0 = (defpackage.amxr) r0;	 Catch:{ all -> 0x00fc }
        r1 = "com/google/mediapipe/framework/Graph";
        r2 = "startRunningGraph";
        r3 = 279; // 0x117 float:3.91E-43 double:1.38E-321;
        r4 = "Graph.java";
        r0 = r0.a(r1, r2, r3, r4);	 Catch:{ all -> 0x00fc }
        r0 = (defpackage.amxr) r0;	 Catch:{ all -> 0x00fc }
        r1 = "MediaPipe graph won't start until all stream headers are available.";
        r0.a(r1);	 Catch:{ all -> 0x00fc }
        monitor-exit(r15);
        return;
    L_0x004e:
        r0 = r15.e;	 Catch:{ all -> 0x00fc }
        r0 = r0.size();	 Catch:{ all -> 0x00fc }
        r9 = new java.lang.String[r0];	 Catch:{ all -> 0x00fc }
        r0 = r15.e;	 Catch:{ all -> 0x00fc }
        r0 = r0.size();	 Catch:{ all -> 0x00fc }
        r10 = new long[r0];	 Catch:{ all -> 0x00fc }
        r0 = r15.e;	 Catch:{ all -> 0x00fc }
        a(r0, r9, r10);	 Catch:{ all -> 0x00fc }
        r0 = r15.f;	 Catch:{ all -> 0x00fc }
        r0 = r0.size();	 Catch:{ all -> 0x00fc }
        r11 = new java.lang.String[r0];	 Catch:{ all -> 0x00fc }
        r0 = r15.f;	 Catch:{ all -> 0x00fc }
        r0 = r0.size();	 Catch:{ all -> 0x00fc }
        r12 = new long[r0];	 Catch:{ all -> 0x00fc }
        r0 = r15.f;	 Catch:{ all -> 0x00fc }
        a(r0, r11, r12);	 Catch:{ all -> 0x00fc }
        r7 = r15.b;	 Catch:{ all -> 0x00fc }
        r6 = r15;
        r6.nativeStartRunningGraph(r7, r9, r10, r11, r12);	 Catch:{ all -> 0x00fc }
        r15.h = r5;	 Catch:{ all -> 0x00fc }
        r0 = r15.i;	 Catch:{ all -> 0x00fc }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00fc }
        if (r0 != 0) goto L_0x00fa;
    L_0x0088:
        r0 = r15.i;	 Catch:{ all -> 0x00fc }
        r0 = r0.entrySet();	 Catch:{ all -> 0x00fc }
        r0 = r0.iterator();	 Catch:{ all -> 0x00fc }
    L_0x0092:
        r1 = r0.hasNext();	 Catch:{ all -> 0x00fc }
        if (r1 == 0) goto L_0x00f5;
    L_0x0098:
        r1 = r0.next();	 Catch:{ all -> 0x00fc }
        r1 = (java.util.Map.Entry) r1;	 Catch:{ all -> 0x00fc }
        r2 = r1.getValue();	 Catch:{ all -> 0x00fc }
        r2 = (java.util.ArrayList) r2;	 Catch:{ all -> 0x00fc }
        r3 = r2.size();	 Catch:{ all -> 0x00fc }
        r5 = 0;
    L_0x00a9:
        if (r5 >= r3) goto L_0x0092;
    L_0x00ab:
        r6 = r2.get(r5);	 Catch:{ all -> 0x00fc }
        r6 = (defpackage.anuv) r6;	 Catch:{ all -> 0x00fc }
        r8 = r15.b;	 Catch:{ MediaPipeException -> 0x00d0 }
        r7 = r1.getKey();	 Catch:{ MediaPipeException -> 0x00d0 }
        r10 = r7;
        r10 = (java.lang.String) r10;	 Catch:{ MediaPipeException -> 0x00d0 }
        r7 = r6.a;	 Catch:{ MediaPipeException -> 0x00d0 }
        r11 = r7.a;	 Catch:{ MediaPipeException -> 0x00d0 }
        r7 = r6.b;	 Catch:{ MediaPipeException -> 0x00d0 }
        r13 = r7.longValue();	 Catch:{ MediaPipeException -> 0x00d0 }
        r7 = r15;
        r7.nativeMovePacketToInputStream(r8, r10, r11, r13);	 Catch:{ MediaPipeException -> 0x00d0 }
        r6 = r6.a;	 Catch:{ all -> 0x00fc }
        r6.c();	 Catch:{ all -> 0x00fc }
        r5 = r5 + 1;
        goto L_0x00a9;
    L_0x00d0:
        r0 = move-exception;
        r2 = a;	 Catch:{ all -> 0x00fc }
        r2 = r2.a();	 Catch:{ all -> 0x00fc }
        r2 = (defpackage.amxr) r2;	 Catch:{ all -> 0x00fc }
        r3 = "com/google/mediapipe/framework/Graph";
        r4 = "moveBufferedPacketsToInputStream";
        r5 = 526; // 0x20e float:7.37E-43 double:2.6E-321;
        r6 = "Graph.java";
        r2 = r2.a(r3, r4, r5, r6);	 Catch:{ all -> 0x00fc }
        r2 = (defpackage.amxr) r2;	 Catch:{ all -> 0x00fc }
        r3 = "AddPacket for stream: %s failed: %s.";
        r1 = r1.getKey();	 Catch:{ all -> 0x00fc }
        r4 = r0.getMessage();	 Catch:{ all -> 0x00fc }
        r2.a(r3, r1, r4);	 Catch:{ all -> 0x00fc }
        throw r0;	 Catch:{ all -> 0x00fc }
    L_0x00f5:
        r0 = r15.i;	 Catch:{ all -> 0x00fc }
        r0.clear();	 Catch:{ all -> 0x00fc }
    L_0x00fa:
        monitor-exit(r15);
        return;
    L_0x00fc:
        r0 = move-exception;
        monitor-exit(r15);
        goto L_0x0100;
    L_0x00ff:
        throw r0;
    L_0x0100:
        goto L_0x00ff;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mediapipe.framework.Graph.b():void");
    }

    public final synchronized void a(String str, Packet packet, long j) {
        amqw.b(this.b != 0, (Object) "Invalid context, tearDown() might have been called.");
        if (this.h) {
            nativeAddPacketToInputStream(this.b, str, packet.a, j);
            return;
        }
        packet = packet.b();
        if (!this.i.containsKey(str)) {
            this.i.put(str, new ArrayList());
        }
        List list = (List) this.i.get(str);
        if (list.size() > 20) {
            for (Entry entry : this.f.entrySet()) {
                if (entry.getValue() == null) {
                    ((amxr) ((amxr) a.a()).a("com/google/mediapipe/framework/Graph", "addPacketToBuffer", 507, "Graph.java")).a("Stream: %s might be missing.", entry.getKey());
                }
            }
            throw new RuntimeException("Graph is not started because of missing streams");
        }
        list.add(new anuv(packet, Long.valueOf(j)));
    }

    public final synchronized void c() {
        amqw.b(this.b != 0, (Object) "Invalid context, tearDown() might have been called.");
        nativeCloseAllInputStreams(this.b);
    }

    public final synchronized void d() {
        amqw.b(this.b != 0, (Object) "Invalid context, tearDown() might have been called.");
        nativeWaitUntilGraphDone(this.b);
    }

    public final synchronized void e() {
        amqw.b(this.b != 0, (Object) "Invalid context, tearDown() might have been called already.");
        for (Entry value : this.e.entrySet()) {
            ((Packet) value.getValue()).c();
        }
        this.e.clear();
        for (Entry value2 : this.f.entrySet()) {
            if (value2.getValue() != null) {
                ((Packet) value2.getValue()).c();
            }
        }
        this.f.clear();
        for (Entry value22 : this.i.entrySet()) {
            ArrayList arrayList = (ArrayList) value22.getValue();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((anuv) arrayList.get(i)).a.c();
            }
        }
        this.i.clear();
        synchronized (this.j) {
            long j = this.b;
            if (j != 0) {
                nativeReleaseGraph(j);
                this.b = 0;
            }
        }
        this.c.clear();
        this.d.clear();
    }

    @Deprecated
    public final synchronized void a(String str, long j) {
        amqw.b(this.b != 0, (Object) "Invalid context, tearDown() might have been called already.");
        amqw.a(str.equals("gpu_shared"));
        a(j);
    }

    private final synchronized void a(long j) {
        amqw.b(this.b != 0, (Object) "Invalid context, tearDown() might have been called already.");
        amqw.b(this.h ^ 1);
        nativeSetParentGlContext(this.b, j);
    }

    private static void a(Map map, String[] strArr, long[] jArr) {
        if (map.size() == strArr.length && map.size() == jArr.length) {
            int i = 0;
            for (Entry entry : map.entrySet()) {
                strArr[i] = (String) entry.getKey();
                jArr[i] = ((Packet) entry.getValue()).a;
                i++;
            }
            return;
        }
        throw new RuntimeException("Input array length doesn't match the map size!");
    }
}
