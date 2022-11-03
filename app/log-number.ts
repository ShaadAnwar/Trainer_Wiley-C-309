import { Pipe, PipeTransform } from "@angular/core";

@Pipe(
    {
        name:'convertlog'
    }
)
export class LogNumber implements PipeTransform {
    transform(value: any, ...args: any[]) {
        return Math.log(value);
    }
}
