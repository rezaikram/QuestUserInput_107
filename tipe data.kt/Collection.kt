fun collection()
println("=== List ===")
// List Read-Only
val readOnlyAbjad = ListOf("A", "B", "C")
println(readOnlyAbjad)

//List Mutable
val shape: Mutablelist<String> =
    MutablelistOf("Circle", "Square", "Triange")
println(shape)

//Menambahkan data kedalam list Mutable
shape.add("Circle")
println(shape)

//Menghapus data dari list Mutable
shape.remove( element: "Triange")
println(shape)

//mengubah data didalam list Mutable
shape[0] = "Oval"
println(shape)

//List Read-Only
val shapesLocked: List<String> shape
println(shapesLocked)
