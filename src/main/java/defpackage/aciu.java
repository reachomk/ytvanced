package defpackage;

import android.util.Log;
import java.net.ProtocolException;
import java.nio.ByteBuffer;

/* renamed from: aciu */
final class aciu implements Runnable {
    private final /* synthetic */ acis a;

    aciu(acis acis) {
        this.a = acis;
    }

    public final void run() {
        try {
            acis acis = this.a;
            while (!acis.c) {
                byte a = acis.a();
                int a2 = acjf.a(a);
                int b = acjf.b(a);
                if (b == 0) {
                    b = acjf.c(acis.a());
                } else if (b == 1) {
                    b = acjf.c(acis.a()) + (acis.a() << 8);
                }
                acja acja = (acja) acis.d.get(b);
                if (acja == null) {
                    acja = new acja();
                    acja.a = b;
                    acja.d = -1;
                    acja.c = -1;
                    acja.h = -1;
                    acja.e = -1;
                    acja.b = -1;
                    acis.d.put(b, acja);
                }
                if (a2 == 0) {
                    acis.a(acis.a, 0, 11);
                    a2 = acjf.a(acis.a, 0);
                    if (acjf.a(a2)) {
                        a2 = acis.b();
                    }
                    acja.h = (long) a2;
                    acja.e = 0;
                    acja.b = acjf.a(acis.a, 3);
                    acja.c = acis.a.get(6) & 255;
                    acja.d = (((acis.a.get(7) & 255) | ((acis.a.get(8) & 255) << 8)) | ((acis.a.get(9) & 255) << 16)) | (acis.a.get(10) << 24);
                } else if (a2 == 1) {
                    acis.a(acis.a, 0, 7);
                    if (acja.d < 0) {
                        throw new ProtocolException("Missing message stream ID from earlier chunk");
                    } else if (acja.h >= 0) {
                        b = acjf.a(acis.a, 0);
                        if (acjf.a(b)) {
                            b = acis.b();
                        }
                        acja.e = b;
                        acja.h += (long) b;
                        acja.b = acjf.a(acis.a, 3);
                        acja.c = acis.a.get(6) & 255;
                    } else {
                        throw new ProtocolException("Missing timestamp from earlier chunk");
                    }
                } else if (a2 == 2) {
                    acis.a(acis.a, 0, 3);
                    if (acja.d < 0) {
                        throw new ProtocolException("Missing message stream ID from earlier chunk");
                    } else if (acja.c < 0) {
                        throw new ProtocolException("Missing message type ID from earlier chunk");
                    } else if (acja.h < 0) {
                        throw new ProtocolException("Missing timestamp from earlier chunk");
                    } else if (acja.b >= 0) {
                        b = acjf.a(acis.a, 0);
                        acja.e = b;
                        acja.h += (long) b;
                    } else {
                        throw new ProtocolException("Missing length from earlier chunk");
                    }
                } else if (a2 != 3) {
                    StringBuilder stringBuilder = new StringBuilder(38);
                    stringBuilder.append("Unrecognized chunk format: ");
                    stringBuilder.append(a2);
                    throw new ProtocolException(stringBuilder.toString());
                } else if (acja.d < 0) {
                    throw new ProtocolException("Missing message stream ID from earlier chunk");
                } else if (acja.c >= 0) {
                    long j = acja.h;
                    if (j >= 0) {
                        int i = acja.e;
                        if (i < 0) {
                            throw new ProtocolException("Missing timestamp delta from earlier chunk");
                        } else if (acja.b >= 0) {
                            acja.h = j + ((long) i);
                        } else {
                            throw new ProtocolException("Missing length from earlier chunk");
                        }
                    }
                    throw new ProtocolException("Missing timestamp from earlier chunk");
                } else {
                    throw new ProtocolException("Missing message type ID from earlier chunk");
                }
                a2 = 5;
                if (acja.f) {
                    a2 = acis.b(acja);
                } else {
                    StringBuilder stringBuilder2;
                    if (acja.a == 2) {
                        if (acja.d == 0) {
                            b = acja.c;
                            if (b == 1) {
                                b = acja.b;
                                if (b == 4) {
                                    b = acis.b();
                                    acis.e = b;
                                    if (acjf.b(b)) {
                                        acis.f = ByteBuffer.allocate(acis.e);
                                    } else {
                                        int i2 = acis.e;
                                        stringBuilder2 = new StringBuilder(31);
                                        stringBuilder2.append("Invalid chunk size: ");
                                        stringBuilder2.append(i2);
                                        throw new ProtocolException(stringBuilder2.toString());
                                    }
                                }
                                stringBuilder2 = new StringBuilder(54);
                                stringBuilder2.append("Invalid message length for set chunk size: ");
                                stringBuilder2.append(b);
                                throw new ProtocolException(stringBuilder2.toString());
                            } else if (b == 2) {
                                b = acja.b;
                                if (b == 4) {
                                    acja acja2 = (acja) acis.d.get(acis.b());
                                    if (acja2 == null) {
                                        Log.e("RtmpInputStream", "Ignoring request to abort unrecognized message");
                                    } else {
                                        acja2.f = true;
                                    }
                                } else {
                                    stringBuilder2 = new StringBuilder(45);
                                    stringBuilder2.append("Invalid message length for abort: ");
                                    stringBuilder2.append(b);
                                    throw new ProtocolException(stringBuilder2.toString());
                                }
                            } else if (b == 3) {
                                b = acja.b;
                                if (b == 4) {
                                    acis.e(acis.b());
                                } else {
                                    stringBuilder2 = new StringBuilder(43);
                                    stringBuilder2.append("Invalid message length for ack: ");
                                    stringBuilder2.append(b);
                                    throw new ProtocolException(stringBuilder2.toString());
                                }
                            } else if (b == 5) {
                                b = acja.b;
                                if (b == 4) {
                                    acis.j = acis.b();
                                } else {
                                    stringBuilder2 = new StringBuilder(55);
                                    stringBuilder2.append("Invalid message length for window ack size: ");
                                    stringBuilder2.append(b);
                                    throw new ProtocolException(stringBuilder2.toString());
                                }
                            } else if (b != 6) {
                                stringBuilder2 = new StringBuilder(47);
                                stringBuilder2.append("Skipping unrecognized message type: ");
                                stringBuilder2.append(b);
                                Log.e("RtmpInputStream", stringBuilder2.toString());
                                a2 = acis.b(acja);
                            } else {
                                b = acja.b;
                                if (b == 5) {
                                    acis.a(acis.b(), acis.a());
                                } else {
                                    stringBuilder2 = new StringBuilder(58);
                                    stringBuilder2.append("Invalid message length for set peer bandwidth: ");
                                    stringBuilder2.append(b);
                                    throw new ProtocolException(stringBuilder2.toString());
                                }
                            }
                            a2 = 4;
                        }
                    }
                    b = acja.c;
                    if (b == 20) {
                        a2 = acis.a(acja);
                    } else {
                        stringBuilder2 = new StringBuilder(43);
                        stringBuilder2.append("Skipping unknown message: type= ");
                        stringBuilder2.append(b);
                        Log.e("RtmpInputStream", stringBuilder2.toString());
                        a2 = acis.b(acja);
                    }
                }
                acis.d(a2);
            }
            synchronized (this.a.k) {
                this.a.b = null;
            }
        } catch (Throwable th) {
            synchronized (this.a.k) {
                this.a.b = null;
            }
        }
    }
}
