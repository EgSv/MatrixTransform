package ru.startandroid.develop.matrixtransform

import android.content.Context
import android.graphics.*
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(DrawView(this))
    }

    /*internal inner class DrawView(context: Context?) : View(context) {
        private var p: Paint = Paint()
        private var path: Path
        private var matriX: Matrix

        init {
            p.strokeWidth = 3f
            p.style = Paint.Style.STROKE
            path = Path()
            matriX = Matrix()
        }

        override fun onDraw(canvas: Canvas) {
            canvas.drawARGB(80, 102, 204, 255)

            path.reset()
            path.addRect(300f, 150f, 450f, 200f, Path.Direction.CW)
            path.addRect(350f, 100f, 400f, 250f, Path.Direction.CW)

            p.color = Color.RED
            canvas.drawPath(path, p)

            matriX.reset()
            matriX.setTranslate(300f, 200f)

            path.transform(matriX)

            p.color = Color.BLUE
            canvas.drawPath(path, p)
        }
    }

     */

    /*internal class DrawView(context: Context?) : View(context) {
        private var p: Paint = Paint()
        private var path: Path
        private var matriX: Matrix

        init {
            p.strokeWidth = 3f
            p.style = Paint.Style.STROKE
            path = Path()
            matriX = Matrix()
        }

        override fun onDraw(canvas: Canvas) {
            canvas.drawARGB(80, 102, 204, 255)

            path.reset()
            path.addRect(300f, 150f, 450f, 200f, Path.Direction.CW)
            path.addRect(350f, 100f, 400f, 250f, Path.Direction.CW)

            p.color = Color.RED
            canvas.drawPath(path, p)

            matriX.reset()
            matriX.setScale(2f, 2.5f, 375f, 100f)

            path.transform(matriX)

            p.color = Color.BLUE
            canvas.drawPath(path, p)


            p.color = Color.BLACK
            canvas.drawCircle(375f, 100f, 5f, p)
        }
    }

     */

    /*internal class DrawView(context: Context?) : View(context) {
        private var p: Paint = Paint()
        private var path: Path
        private var matriX: Matrix

        init {
            p.strokeWidth = 3f
            p.style = Paint.Style.STROKE
            path = Path()
            matriX = Matrix()
        }

        override fun onDraw(canvas: Canvas) {
            canvas.drawARGB(80, 102, 204, 255)

            path.reset()
            path.addRect(300f, 150f, 450f, 200f, Path.Direction.CW)
            path.addRect(350f, 100f, 400f, 250f, Path.Direction.CW)
            path.addCircle(375f, 125f, 5f, Path.Direction.CW)

            p.color = Color.GREEN
            canvas.drawPath(path, p)

            matriX.reset()
            matriX.setRotate(120f, 600f, 400f)

            path.transform(matriX)

            p.color = Color.BLUE
            canvas.drawPath(path, p)

            p.color = Color.BLACK
            canvas.drawCircle(600f, 400f, 5f, p)
        }
    }

         */

    /*internal class DrawView(context: Context?) : View(context) {
        private var p: Paint = Paint()
        private var path: Path
        private var pathDst: Path
        private var matriX: Matrix

        init {
            p.strokeWidth = 3f
            p.style = Paint.Style.STROKE
            path = Path()
            pathDst = Path()
            matriX = Matrix()
        }

        override fun onDraw(canvas: Canvas) {
            canvas.drawARGB(80, 102, 204, 255)
            p.color = Color.BLACK
            canvas.drawCircle(400f, 200f, 10f, p)

            // прямоугольник
            path.reset()
            path.addRect(300f, 100f, 500f, 300f, Path.Direction.CW)
            canvas.drawPath(path, p)

            // перемещение после поворота
            matriX.reset()
            matriX.setRotate(45f, 400f, 200f)
            matriX.postTranslate(500f, 0f)
            path.transform(matriX, pathDst)
            p.color = Color.GREEN
            canvas.drawPath(pathDst, p)

            // перемещение до поворота
            matriX.reset()
            matriX.setRotate(45f, 400f, 200f)
            matriX.preTranslate(500f, 0f)
            path.transform(matriX, pathDst)
            p.color = Color.RED
            canvas.drawPath(pathDst, p)
        }
    }

     */

    /*internal class DrawView(context: Context?) : View(context) {
        private var p: Paint = Paint()
        private var path: Path
        private var pathDst: Path
        private var matriX: Matrix

        init {
            p.strokeWidth = 3f
            p.style = Paint.Style.STROKE
            path = Path()
            pathDst = Path()
            path.addRect(100f, 100f, 200f, 200f, Path.Direction.CW)
            matriX = Matrix()
        }

        override fun onDraw(canvas: Canvas) {
            canvas.drawARGB(80, 102, 204, 255)
            p.color = Color.BLACK
            canvas.drawPath(path, p)
            p.color = Color.GREEN

            matriX.reset()
            matriX.setTranslate(200f, 0f)
            matriX.postSkew(0.0f, 0.5f, 300f, 100f)
            path.transform(matriX, pathDst)
            canvas.drawPath(pathDst, p)
            canvas.drawCircle(300f, 100f, 5f, p)

            matriX.reset()
            matriX.setTranslate(400f, 0f)
            matriX.postSkew(0.0f, 0.5f, 600f, 100f)
            path.transform(matriX, pathDst)
            canvas.drawPath(pathDst, p)
            canvas.drawCircle(600f, 100f, 5f, p)
            p.color = Color.BLUE

            matriX.reset()
            matriX.setTranslate(0f, 150f)
            matriX.postSkew(0.5f, 0.0f, 100f, 250f)
            path.transform(matriX, pathDst)
            canvas.drawPath(pathDst, p)
            canvas.drawCircle(100f, 250f, 5f, p)

            matriX.reset()
            matriX.setTranslate(0f, 300f)
            matriX.postSkew(0.5f, 0.0f, 100f, 500f)
            path.transform(matriX, pathDst)
            canvas.drawPath(pathDst, p)
            canvas.drawCircle(100f, 500f, 5f, p)
        }
    }

     */

    internal class DrawView(context: Context?) : View(context) {
        private var p: Paint = Paint()
        private var matriX: Matrix
        private var rectf: RectF
        private var rectfDst: RectF
        private var path: Path

        init {
            p.strokeWidth = 3f
            p.style = Paint.Style.STROKE
            rectf = RectF(100f, 100f, 200f, 200f)
            rectfDst = RectF()
            matriX = Matrix()
            path = Path()
        }

        override fun onDraw(canvas: Canvas) {
            canvas.drawARGB(80, 102, 204, 255)
            
            path.reset()
            path.addRect(rectf, Path.Direction.CW)
            p.color = Color.BLACK
            canvas.drawPath(path, p)
            
            matriX.setRotate(45f, 150f, 150f)
            matriX.postScale(1.2f, 0.8f, 150f, 150f)
            matriX.postTranslate(200f, 0f)
            path.transform(matriX)
            
            p.color = Color.GREEN
            canvas.drawPath(path, p)
            
            matriX.mapRect(rectfDst, rectf)
            p.color = Color.BLUE
            canvas.drawRect(rectfDst, p)
        }
    }
}