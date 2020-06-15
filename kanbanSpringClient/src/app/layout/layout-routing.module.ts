import { Routes, RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';
import { LayoutComponent } from './layout.component';

export const routes: Routes = [
    {
        path: "", component: LayoutComponent,
        children: [
            {
                path: ":username",
                loadChildren: () => import("src/app/modules/user/user.module").then(module => module.UserModule)
            },
            {
                path: "b",
                loadChildren: () => import("src/app/modules/board-details/board-details.module").then(module => module.BoardDetailsModule)

            }
        ]
    }
]

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class LayoutRoutingModule { }