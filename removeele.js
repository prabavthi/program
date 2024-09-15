let array = [34, 24, 31, 48];

console.log("Array = [" + array + "]");

function gfg_Run() {
  array.splice(-1, 1);

  console.log("Remaining array = [" + array + "]");
}
gfg_Run();
