import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { KnockoutFixturesComponent } from './knockout-fixtures.component';

describe('KnockoutFixturesComponent', () => {
  let component: KnockoutFixturesComponent;
  let fixture: ComponentFixture<KnockoutFixturesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ KnockoutFixturesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(KnockoutFixturesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
