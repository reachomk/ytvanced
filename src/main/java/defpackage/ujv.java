package defpackage;

import java.nio.ShortBuffer;

/* renamed from: ujv */
final class ujv {
    public int a;
    public ujy b;
    private ShortBuffer c = ShortBuffer.allocate(4096);
    private long d = 0;

    ujv() {
    }

    public final synchronized void a(ShortBuffer shortBuffer) {
        uhy.b(this.a > 0, "Invalid ticksPerSample (%s)", Integer.valueOf(this.a));
        uhy.a(this.b);
        uhy.a(shortBuffer.remaining() % this.b.a == 0, "samplesBuffer does not have an even number remaining (%s)", Integer.valueOf(shortBuffer.remaining()));
        int position = (((int) this.d) / this.a) - (this.c.position() / this.b.a);
        if (position > 0) {
            int min = Math.min(position, shortBuffer.remaining() / this.b.a);
            shortBuffer.position(shortBuffer.position() + (this.b.a * min));
            this.d -= (long) (min * this.a);
        }
        if (this.c.remaining() < shortBuffer.remaining()) {
            d();
            this.c = b(this.c.position() + shortBuffer.remaining());
        }
        this.c.put(shortBuffer);
    }

    public final synchronized float a() {
        if (this.d < 0) {
            return 0.0f;
        }
        int e = e();
        if (this.b.a()) {
            return ((float) (this.c.get(e) + this.c.get(e + 1))) * 0.5f;
        }
        return (float) this.c.get(e);
    }

    public final synchronized void a(long j) {
        this.d += j;
    }

    public final synchronized long b() {
        long position;
        position = (this.a <= 0 || this.b == null) ? 0 : ((long) (this.c.position() / this.b.a)) * ((long) this.a);
        return Math.max(0, position - this.d);
    }

    public final int c() {
        return 7056000 / this.a;
    }

    private final synchronized void d() {
        int e = e();
        if (e > 0) {
            ShortBuffer shortBuffer = this.c;
            shortBuffer.limit(shortBuffer.position());
            this.c.position(e);
            this.c.compact();
            this.d -= (long) ((e / this.b.a) * this.a);
        }
    }

    private final synchronized int e() {
        return (((int) this.d) / this.a) * this.b.a;
    }

    private final synchronized ShortBuffer b(int i) {
        ShortBuffer shortBuffer;
        shortBuffer = this.c;
        if (shortBuffer.capacity() < i) {
            int capacity = this.c.capacity();
            do {
                capacity += capacity;
            } while (capacity < i);
            i = this.c.capacity();
            StringBuilder stringBuilder = new StringBuilder(51);
            stringBuilder.append("Buffer grown from ");
            stringBuilder.append(i);
            stringBuilder.append(" to ");
            stringBuilder.append(capacity);
            stringBuilder.append(" shorts");
            ujo.c(stringBuilder.toString());
            shortBuffer = ShortBuffer.allocate(capacity);
            this.c.flip();
            shortBuffer.put(this.c);
        }
        return shortBuffer;
    }

    public final synchronized float a(int i) {
        if (this.d < 0) {
            return 0.0f;
        }
        int e = e();
        if (this.b.a()) {
            e += i - 1;
        }
        return (float) this.c.get(e);
    }
}
