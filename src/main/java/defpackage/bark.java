package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.CharacterCodingException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;

/* renamed from: bark */
public abstract class bark {
    public OutputStream a;
    public final baqy b = new barj(this, barc.SWITCH_PROTOCOL);
    public int c = 1;
    private final InputStream d;
    private barn e = null;
    private final List f = new LinkedList();

    public bark(baqw baqw) {
        this.d = baqw.b();
        this.b.a("upgrade", "websocket");
        this.b.a("connection", "Upgrade");
    }

    public abstract void a();

    public abstract void a(barl barl);

    public abstract void a(IOException iOException);

    public abstract void a(String str, boolean z);

    public abstract void b();

    public final void c() {
        String str = "Handler terminated without closing the connection.";
        while (this.c == 3) {
            try {
                barl a = barl.a(this.d);
                if (a.b == barn.Close) {
                    int i;
                    String str2 = "";
                    if (a instanceof baro) {
                        baro baro = (baro) a;
                        int i2 = baro.h;
                        str2 = baro.g;
                        i = i2;
                    } else {
                        i = 1000;
                    }
                    if (this.c == 4) {
                        b(str2, false);
                    } else {
                        a(i, str2, true);
                    }
                } else if (a.b == barn.Ping) {
                    b(new barl(barn.Pong, a.e));
                } else if (a.b == barn.Pong) {
                    b();
                } else if (!a.c || a.b == barn.Continuation) {
                    if (a.b == barn.Continuation) {
                        String str3 = "Continuous frame sequence was not started.";
                        if (a.c) {
                            barn barn = this.e;
                            if (barn != null) {
                                a(new barl(barn, this.f));
                                this.e = null;
                                this.f.clear();
                            } else {
                                throw new barm(1002, str3);
                            }
                        } else if (this.e != null) {
                            this.f.add(a);
                        } else {
                            throw new barm(1002, str3);
                        }
                    } else if (this.e == null) {
                        this.e = a.b;
                        this.f.clear();
                        this.f.add(a);
                    } else {
                        throw new barm(1002, "Previous continuous frame sequence not completed.");
                    }
                } else if (this.e == null) {
                    if (a.b != barn.Text) {
                        if (a.b != barn.Binary) {
                            throw new barm(1002, "Non control or continuous frame expected.");
                        }
                    }
                    a(a);
                } else {
                    throw new barm(1002, "Continuous frame sequence not completed.");
                }
            } catch (CharacterCodingException e) {
                a(e);
                b(e.toString(), false);
                b(str, false);
                return;
            } catch (IOException e2) {
                a(e2);
                if (e2 instanceof barm) {
                    b(((barm) e2).a, false);
                }
                b(str, false);
                return;
            } catch (Throwable th) {
                b(str, false);
                throw th;
            }
        }
        b(str, false);
    }

    public final synchronized void b(barl barl) {
        OutputStream outputStream = this.a;
        int i = 0;
        outputStream.write((byte) ((!barl.c ? 0 : -128) | (barl.b.g & 15)));
        int length = barl.e.length;
        barl.f = length;
        if (length <= 125) {
            outputStream.write(barl.b() ? ((byte) barl.f) | 128 : (byte) barl.f);
        } else if (length <= 65535) {
            outputStream.write(!barl.b() ? 126 : 254);
            outputStream.write(barl.f >>> 8);
            outputStream.write(barl.f);
        } else {
            outputStream.write(!barl.b() ? 127 : 255);
            length = barl.f;
            outputStream.write(0);
            length = barl.f;
            outputStream.write(0);
            length = barl.f;
            outputStream.write(0);
            length = barl.f;
            outputStream.write(0);
            outputStream.write(barl.f >>> 24);
            outputStream.write(barl.f >>> 16);
            outputStream.write(barl.f >>> 8);
            outputStream.write(barl.f);
        }
        if (barl.b()) {
            outputStream.write(barl.d);
            while (i < barl.f) {
                outputStream.write(barl.e[i] ^ barl.d[i % 4]);
                i++;
            }
        } else {
            outputStream.write(barl.e);
        }
        outputStream.flush();
    }

    public final void a(int i, String str, boolean z) {
        int i2 = this.c;
        this.c = 4;
        if (i2 == 3) {
            b(new baro(i, str));
        } else {
            b(str, z);
        }
    }

    private final void b(String str, boolean z) {
        if (this.c != 5) {
            InputStream inputStream = this.d;
            String str2 = "close failed";
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    barh.l.log(Level.FINE, str2, e);
                }
            }
            OutputStream outputStream = this.a;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e2) {
                    barh.l.log(Level.FINE, str2, e2);
                }
            }
            this.c = 5;
            a(str, z);
        }
    }
}
